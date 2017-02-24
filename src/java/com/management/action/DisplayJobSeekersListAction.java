/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.action;

import com.management.model.SuitableJobForm;
import com.management.service.DisplayJobSeekersListService;
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
public class DisplayJobSeekersListAction extends Action {


public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

    ArrayList<SuitableJobForm> js=new ArrayList<SuitableJobForm>();
      SuitableJobForm display=(SuitableJobForm)form;
        try{
            DisplayJobSeekersListService displayjobseeker=new DisplayJobSeekersListService();
            js=displayjobseeker.displayJobSeeker(display);
        }
        catch(Exception e){
            System.out.println(e);
        }
        request.setAttribute("jobseeker", js);
          return mapping.findForward("displayalljobseekers");
}

}
