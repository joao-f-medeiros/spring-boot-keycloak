package com.keycloak.authservice.resources;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentResource {

    @GetMapping(value = {"/", "/login"})
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @GetMapping(value = {"/home"})
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @GetMapping(value = {"/manage-students"})
    @PreAuthorize("hasAuthority('PROFESSOR')")
    public ModelAndView manageStudents() {
        ModelAndView modelAndView = new ModelAndView("manage-students");
        return modelAndView;
    }

    @GetMapping(value = {"/access-denied"})
    public ModelAndView accessDenied() {
        ModelAndView modelAndView = new ModelAndView("access-denied");
        return modelAndView;
    }
}
