package com.adobe.aem.guides.MySites.core.servlets;

import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.osgi.service.component.annotations.Component;
import javax.servlet.Servlet;
import java.io.IOException;
import org.apache.sling.servlets.annotations.SlingServletPaths;


@Component(service = Servlet.class)
@SlingServletPaths("/bin/demo")

public class DemoServelet extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.getWriter().write("{\"message\":\"Hello from DemoServelet!\"}");
    }
}