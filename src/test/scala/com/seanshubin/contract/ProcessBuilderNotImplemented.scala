package com.seanshubin.contract

import java.io.File
import java.lang.ProcessBuilder.Redirect
import java.util

trait ProcessBuilderNotImplemented extends ProcessBuilderContract {
  override def command(command: util.List[String]): ProcessBuilderContract = ???

  override def directory(directory: File): ProcessBuilderContract = ???

  override def directory: File = ???

  override def redirectInput(source: Redirect): ProcessBuilderContract = ???

  override def redirectInput(file: File): ProcessBuilderContract = ???

  override def redirectInput: Redirect = ???

  override def redirectError(destination: Redirect): ProcessBuilderContract = ???

  override def redirectError(file: File): ProcessBuilderContract = ???

  override def redirectError: Redirect = ???

  override def environment: util.Map[String, String] = ???

  override def redirectOutput(destination: Redirect): ProcessBuilderContract = ???

  override def redirectOutput(file: File): ProcessBuilderContract = ???

  override def redirectOutput: Redirect = ???

  override def command(command: String*): ProcessBuilderContract = ???

  override def command: util.List[String] = ???

  override def redirectErrorStream: Boolean = ???

  override def redirectErrorStream(redirectErrorStream: Boolean): ProcessBuilderContract = ???

  override def inheritIO: ProcessBuilderContract = ???

  override def start(): Process = ???
}
