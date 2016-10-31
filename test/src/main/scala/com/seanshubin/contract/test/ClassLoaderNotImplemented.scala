package com.seanshubin.contract.test

import java.io.InputStream
import java.net.URL
import java.util

import com.seanshubin.contract.domain.ClassLoaderContract

trait ClassLoaderNotImplemented extends ClassLoaderContract {
  override def loadClass(name: String): Class[_] = ???

  override def getResource(name: String): URL = ???

  override def getResources(name: String): util.Enumeration[URL] = ???

  override def getSystemResource(name: String): URL = ???

  override def getSystemResources(name: String): util.Enumeration[URL] = ???

  override def getResourceAsStream(name: String): InputStream = ???

  override def getSystemResourceAsStream(name: String): InputStream = ???

  override def getParent: ClassLoader = ???

  override def getSystemClassLoader: ClassLoader = ???

  override def setDefaultAssertionStatus(enabled: Boolean): Unit = ???

  override def setPackageAssertionStatus(packageName: String, enabled: Boolean): Unit = ???

  override def setClassAssertionStatus(className: String, enabled: Boolean): Unit = ???

  override def clearAssertionStatus(): Unit = ???
}
