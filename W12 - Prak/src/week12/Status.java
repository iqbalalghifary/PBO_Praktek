/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

/**
 *
 * @author ikbalalghifary
 */
public class Status 
{
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

 
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private int code;
    private String description;
}
