g_syslog.info("\n--START--------------------------------------------RUN-GC-UPSUPPORT-JMXPROZESS-------------------------------------------START--\n")
System.gc()
System.runFinalization()
g_syslog.info("\n--STOP---------------------------------------------RUN-GC-UPSUPPORT-JMXPROZESS--------------------------------------------STOP--\n")
