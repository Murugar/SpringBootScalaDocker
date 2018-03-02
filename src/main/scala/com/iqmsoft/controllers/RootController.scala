package com.iqmsoft.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._

import scala.collection.JavaConversions._

@Controller
@CrossOrigin
class RootController {

  @RequestMapping(method = Array(GET), value = Array("/"))
  def hello(@RequestParam(value="name", required=false, defaultValue="From Spring Boot Scala") name: String, model: Model): String = {
    model.addAttribute("name", name)
    "hello"
  }

}