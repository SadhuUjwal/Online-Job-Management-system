/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.action;

import com.management.model.JobUploadForm;
import com.management.service.DisplayAllJobsService;
import java.util.ArrayList;
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
public class DisplayAllJobsInEmpAction extends Action {
   public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

      ArrayList<JobUploadForm> b1=new ArrayList<JobUploadForm>();
        JobUploadForm displayall=(JobUploadForm)form;
        try{
            DisplayAllJobsService displayalljobservice=new DisplayAllJobsService();
            b1=displayalljobservice.validateUser(displayall);
        }
        catch(Exception e){
            System.out.println(e);
        }
        request.setAttribute("joblistinemp", b1);
          return mapping.findForward("displayalljobsInEmp");
     }
}
