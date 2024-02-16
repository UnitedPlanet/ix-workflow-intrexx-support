import java.lang.management.ManagementFactory
import javax.management.ObjectName
import javax.management.Attribute


try
{
	def mbs = ManagementFactory.getPlatformMBeanServer()

	def wcMbean = mbs.getObjectInstance(new ObjectName("de.uplanet.lucy.server.management:type=WebConnector"))

	mbs.setAttribute(wcMbean.objectName, new Attribute("LogRequestProcessingTime", true))
}
catch (e)
{
	g_syslog.error(e.message, e)
}
