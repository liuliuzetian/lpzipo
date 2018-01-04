package com.lpzipo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * handler method 参数绑定常用的注解,我们根据他们处理的Request的不同内容部分分为四类：（主要讲解常用类型）
 * A、处理requet uri 部分（这里指uri template中variable，不含queryString部分）的注解：   @PathVariable;
 * B、处理request header部分的注解：   @RequestHeader, @CookieValue;
 * C、处理request body部分的注解：@RequestParam,  @RequestBody;
 * D、处理attribute类型是注解： @SessionAttributes, @ModelAttribute;
 */

/**
 * 一：
 * @RequestMapping   RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
 *
 *
 * RequestMapping注解有六个属性，下面我们把她分成三类进行说明（下面有相应示例）。
 *
 * 1. value， method；
 *      value：     指定请求的实际地址，指定的地址可以是URI Template 模式
 *      method：  指定请求的method类型， GET、POST、PUT、DELETE等；
 *
 * 2. consumes，produces
 *      consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
 *      produces:    指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；
 *
 * 3. params，headers
 *      params： 指定request中必须包含某些参数值是，才让该方法处理。
 *      headers： 指定request中必须包含某些指定的header值，才能让该方法处理请求。
 *
 * 二：
 *@ModelAttribute和 @SessionAttributes
 *      @ModelAttribute：
 *          代表的是：该Controller的所有方法在调用前，先执行此@ModelAttribute方法，可用于注解和方法参数中，可以把这个
 *          ModelAttribute特性，应用在BaseController当中，所有的Controller继承BaseController，即可实现在调用Controller时，先执行@ModelAttribute方法。
 *      @SessionAttributes
 *          即将值放到session作用域中，写在class上面。
 *
 * 三：
 * @PathVariable
 *        当使用@RequestMapping URI template 样式映射时， 即 someUrl/{paramId}, 这时的paramId可通过 @Pathvariable注解绑定它传过来的值到方法的参数上。
 *
 * 四：
 * @RequestParam, @RequestBody
 *      RequestParam  常用来处理简单类型的绑定，通过Request.getParameter() 获取的String可直接转换为简单类型的情况
 *      因为使用request.getParameter()方式获取参数，所以可以处理get 方式中queryString的值，也可以处理post方式中 body data的值；
 *      用来处理Content-Type: 为 application/x-www-form-urlencoded编码的内容，提交方式GET、POST；
 *      该注解有两个属性： value、required； value用来指定要传入值的id名称，required用来指示参数是否必须绑定；
 *      RequestBody
 *      该注解常用来处理Content-Type: 不是application/x-www-form-urlencoded编码的内容，例如application/json,application/xml等； 将json字符转换为Bean
 *      将HTTP请求正文转换为适合的HttpMessageConverter对象
 *
 *
 * 五： @RequestHeader、@CookieValue
 *      RequestHeader 注解，可以把Request请求header部分的值绑定到方法的参数上。
 *      @CookieValue 可以把Request header中关于cookie的值绑定到方法的参数上。
 *
 */

@Controller
@RequestMapping("/user")
public class BaseController {

    @RequestMapping(value = "/info" ,method = RequestMethod.GET)
    public String getUserInfo(String param){
        return  "";
    }

}
