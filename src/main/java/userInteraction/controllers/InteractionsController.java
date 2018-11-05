package userInteraction.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import userInteraction.converters.InteractionsToInteractionsForm;
import userInteraction.dummies.InteractionsForm;
import userInteraction.entities.Interactions;
import userInteraction.services.InteractionsService;

@Controller
public class InteractionsController {

	private InteractionsService interactionsService;

    private InteractionsToInteractionsForm interactionsToInteractionsForm;

    @Autowired
    public void setInteractionsToInteractionsForm(InteractionsToInteractionsForm interactionsToInteractionsForm) {
        this.interactionsToInteractionsForm = interactionsToInteractionsForm;
    }

    @Autowired
    public void setInteractionsService(InteractionsService interactionsService) {
        this.interactionsService = interactionsService;
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/interact/list";
    }

    @RequestMapping({"/interact/list", "/interact"})
    public String listInteractions(Model model){
        model.addAttribute("interactions", interactionsService.listAll());
        return "interact/list";
    }

    @RequestMapping(value = "/interact/show/{customerId}/{id}", method=RequestMethod.GET)
    public String getInteraction(@PathVariable String customerId, @PathVariable String id, Model model){
    	model.addAttribute("interaction", interactionsService.getByCustomerIdAndId(customerId, id));
        return "interact/show";
    }

    @RequestMapping("interact/edit/{customerId}/{id}")
    public String edit(@PathVariable String customerId, @PathVariable String id, Model model){
    	Interactions interaction = interactionsService.getByCustomerIdAndId(customerId, id);
        InteractionsForm interactionForm = interactionsToInteractionsForm.convert(interaction);

        model.addAttribute("interactionForm", interactionForm);
        return "interact/interactionform";
    }

    @RequestMapping("/interact/new")
    public String newInteraction(Model model){
        model.addAttribute("interactionForm", new InteractionsForm());
        return "interact/interactionform";
    }

    @RequestMapping(value = "/interacting", method = RequestMethod.POST)
    public String saveOrUpdateInteraction(@Valid InteractionsForm interactionsForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "interact/interactionform";
        }

        Interactions savedInteraction= interactionsService.saveOrUpdateInteractionsForm(interactionsForm);

        return "redirect:/interact/show/" + savedInteraction.getId();
    }

    @RequestMapping("/interact/delete/{customerId}/{id}")
    public String delete(@PathVariable String customerId, @PathVariable String id){
        interactionsService.delete(customerId, id);
        return "redirect:/interact/list";
    }
	
}
