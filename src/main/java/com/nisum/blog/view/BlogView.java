/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nisum.blog.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogView {
	
	
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public ModelAndView blog() {
		
		System.out.println("In the blog..............");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("blog");		
		return mav;

	}
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView test() {
		
		System.out.println("In the test..............");
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello word!");
		mav.setViewName("test");		
		return mav;

	}
	
	
	
}
