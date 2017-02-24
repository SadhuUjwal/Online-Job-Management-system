/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.action;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.management.model.JobUploadForm;
//import com.management.model.SuitableJobForm;
import com.management.service.SuitableJobService;
/**
 *
 * @author mslc
 */
public class DisplaySuitableJobs extends Action {
//private static final String SUCCESS = "success";
    //private static final String FAIL = "fail";


	 public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
             
             ArrayList array3=null;
             JobUploadForm juf=(JobUploadForm)form;
             String skills=juf.getSkills();
             String qualification=juf.getQualification();

 //try
        {
            SuitableJobService js=new SuitableJobService();

             array3=js.SuitableJob(skills,qualification);
             System.out.println(array3);
request.setAttribute("list", array3);
       // }
       // catch(Exception e)
        //{
      //  System.out.println(e);
      //  }
        //HttpSession session=request.getSession();
//session.setAttribute("varname",array3);
           return mapping.findForward("a");

    }



    }
}
