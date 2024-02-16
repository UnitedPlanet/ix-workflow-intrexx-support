
de.uplanet.lucy.server.security.IxAccessController.checkPermission(new java.security.AllPermission())

def mbean = g_springApplicationContext.getBean("loggingMx")
assert mbean

mbean.disableJdbcTrace()

g_syslog.info("\n--STOP--------------------------------------------JDBCTrace-UPSUPPORT-JMXPROZESS-------------------------------------------STOP--\n")
