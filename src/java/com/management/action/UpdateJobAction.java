/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.action;

import com.management.model.JobUploadForm;
import com.management.service.UpdateJobService;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author mslc
 */
public class UpdateJobAction extends org.apache.struts.action.Action{
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
       ArrayList<JobUploadForm> b=new ArrayList<JobUploadForm>();
        JobUploadForm update=(JobUploadForm)form;
        int jobid=update.getJobId();
         try{
          UpdateJobService updatejob=new UpdateJobService();
          b=updatejob.updateJob(jobid);
        }
         catch(Exception e)
         {
            System.out.println(e);
         }
          request.setAttribute("update", b);
          return mapping.findForward("updatejob");

        }

}
