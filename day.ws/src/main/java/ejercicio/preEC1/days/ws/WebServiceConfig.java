package ejercicio.preEC1.days.ws;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
			ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/wseclel/*");
	}

	@Bean(name = "days")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema daySchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("DaysPort");
		wsdl11Definition.setLocationUri("/wseclel");
		wsdl11Definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
		wsdl11Definition.setSchema(daySchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema daySchema() {
		return new SimpleXsdSchema(new ClassPathResource("days.xsd"));
	}
}
