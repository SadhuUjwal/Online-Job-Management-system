/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.action;

import com.management.model.JobUploadForm;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.management.model.RecommendedJob;
import com.management.service.DisplayBPOJobService;
import com.management.service.DisplayITJobService;
import com.management.service.DisplayOtherJobService;
import com.management.service.RecommendedJobService;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mslc
 */
public class RecommendedJobAction extends Action{
        String bpo="BPO";
        String IT="IT";
        String Other="Other";
        ArrayList al=null;

   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String a2="";
        RecommendedJob rj=(RecommendedJob)form;
        String username=rj.getUsername();
//System.out.println("a");
        RecommendedJobService rjs=new RecommendedJobService();
        a2=rjs.recommendUser(username);
        
if(a2.equalsIgnoreCase("BPO"))
{
    JobUploadForm juf = null;
DisplayBPOJobService dbpo=new DisplayBPOJobService();
al=dbpo.DisplayBPOUser();
request.setAttribute("list", al);
//System.out.println("a");
return mapping.findForward("BPO");
}
        if(a2.equalsIgnoreCase("IT"))
{
    JobUploadForm juf = null;
DisplayITJobService dbpo=new DisplayITJobService();
al=dbpo.DisplayITUser();
request.setAttribute("list", al);
return mapping.findForward("IT");
}
 else
{
    JobUploadForm juf = null;
DisplayOtherJobService dbpo=new DisplayOtherJobService();
al=dbpo.DisplayOtherUser();
request.setAttribute("list", al);
return mapping.findForward("Other");
}


       
           //return mapping.findForward(a2);

    }

}
