
g_syslog.info("\n--START-----------------------------------------MakeHeapDump Intrexx Support Prozess-----------------------------------------START--\n")

de.uplanet.lucy.server.security.IxAccessController.checkPermission(new java.security.AllPermission())

hprofguid = newGuid()

g_syslog.info("heapdump-up-support-" + hprofguid + ".hprof")

de.uplanet.lucy.server.support.scripting.groovy.GroovySupportHelper.dumpHeap("heapdump-up-support-" + hprofguid + ".hprof", true)

g_syslog.info("\n--STOP------------------------------------------MakeHeapDump Intrexx Support Prozess------------------------------------------STOP--\n")
