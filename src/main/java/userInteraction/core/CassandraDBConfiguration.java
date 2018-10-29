package userInteraction.core;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
//import org.springframework.data.cassandra.core.cql.keyspace.DropKeyspaceSpecification;
import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.SimpleUserTypeResolver;

@Configuration
public class CassandraDBConfiguration extends AbstractCassandraConfiguration {
//	cassandraInstance at local docker
//	public static final String KEYSPACE = "user_interactions";
	
//	cassandra at cloud
	public static final String KEYSPACE = "interactions";
	
	@Override
	protected String getKeyspaceName() {
		return KEYSPACE;
	}
	
	@Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

	@Override
    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
        CreateKeyspaceSpecification specification = CreateKeyspaceSpecification.createKeyspace(KEYSPACE).ifNotExists();

        return Arrays.asList(specification);
    }
	
	// no need to drop keyspace at the moment
//    @Override
//    protected List<DropKeyspaceSpecification> getKeyspaceDrops() {
//        return Arrays.asList(DropKeyspaceSpecification.dropKeyspace(KEYSPACE));
//    }
    
    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"userInteraction.entities"};
    }

    @Bean
	public CassandraMappingContext mappingContext() throws Exception {
		@SuppressWarnings("deprecation")
		BasicCassandraMappingContext mappingContext = new BasicCassandraMappingContext();
		mappingContext.setUserTypeResolver(new SimpleUserTypeResolver(cluster().getObject(), KEYSPACE));
		return mappingContext;
	}
}
