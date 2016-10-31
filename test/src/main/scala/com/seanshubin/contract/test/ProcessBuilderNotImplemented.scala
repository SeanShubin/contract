package com.seanshubin.contract.test

import java.io.File
import java.lang.ProcessBuilder.Redirect
import java.util

import com.seanshubin.contract.domain.ProcessBuilderContract

trait ProcessBuilderNotImplemented extends ProcessBuilderContract {
  override def command(command: util.List[String]): ProcessBuilderContract = ???

  override def command(command: String*): ProcessBuilderContract = ???

  override def command: util.List[String] = ???

  override def environment: util.Map[String, String] = ???

  override def directory: File = ???

  override def directory(directory: File): ProcessBuilderContract = ???

  override def redirectInput(source: Redirect): ProcessBuilderContract = ???

  override def redirectOutput(destination: Redirect): ProcessBuilderContract = ???

  override def redirectError(destination: Redirect): ProcessBuilderContract = ???

  override def redirectInput(file: File): ProcessBuilderContract = ???

  override def redirectOutput(file: File): ProcessBuilderContract = ???

  override def redirectError(file: File): ProcessBuilderContract = ???

  override def redirectInput: Redirect = ???

  override def redirectOutput: Redirect = ???

  override def redirectError: Redirect = ???

  override def inheritIO: ProcessBuilderContract = ???

  override def redirectErrorStream: Boolean = ???

  override def redirectErrorStream(redirectErrorStream: Boolean): ProcessBuilderContract = ???

  override def start(): Process = ???
}
