package com.briz.sprinboot_ngrok_testing;

@RestController
public class MyController 
{
@RequestMapping("/test")
  public String test()
  {
    return "this is jenkins test";
}
