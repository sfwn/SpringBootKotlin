package com.github.sfwn.restful

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by sfwn on 8/30/16.
 */

@RestController
class HelloController {

    @RequestMapping("/", method = arrayOf(RequestMethod.GET))
    fun index(): String {
        return "Welcome to Hangzhou, China :)"
    }
}