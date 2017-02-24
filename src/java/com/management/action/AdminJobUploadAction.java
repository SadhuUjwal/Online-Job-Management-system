/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.action;

import com.management.model.JobUploadForm;
import com.management.service.JobUploadService;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;



/**
 *
 * @author mslc
 */
public class AdminJobUploadAction extends Action{
    private static final String SUCCESS="success";

public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
  
    JobUploadForm juf=(JobUploadForm)form;
    try{
    JobUploadService jus=new JobUploadService();
    jus.validateUser(juf);
       }
    catch(Exception e)
        {
        System.out.println(e);
        }
    PrintWriter out=response.getWriter();
    System.out.println("Successfully registered");
    return mapping.findForward(SUCCESS);

}

}
