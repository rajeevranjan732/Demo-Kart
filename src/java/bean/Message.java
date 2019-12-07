/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author rajeev
 */
public class Message {
    
    private String message=null;
    private String url=null;
    public Message(String s1,String s2)
    {
        message=s1;
        url=s2;
    }
    public void setMessage(String message)
    {
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
    
     public void setUrl(String url)
    {
        this.url=url;
    }
    public String getUrl(){
        return url;
    }
}
