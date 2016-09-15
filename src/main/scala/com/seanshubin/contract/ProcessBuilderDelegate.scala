package com.seanshubin.contract

import java.io.File
import java.lang.ProcessBuilder.Redirect
import java.util

class ProcessBuilderDelegate(delegate: ProcessBuilder) extends ProcessBuilderContract {
  override def command(command: util.List[String]): ProcessBuilderContract =
    new ProcessBuilderDelegate(delegate.command(command))

  override def directory(directory: File): ProcessBuilderContract =
    new ProcessBuilderDelegate(delegate.directory(directory))

  override def directory: File = delegate.directory

  override def redirectInput(source: Redirect): ProcessBuilderContract =
    new ProcessBuilderDelegate(delegate.redirectInput(source))

  override def redirectInput(file: File): ProcessBuilderContract =
    new ProcessBuilderDelegate(delegate.redirectInput(file))

  override def redirectInput: Redirect = delegate.redirectInput

  override def redirectError(destination: Redirect): ProcessBuilderContract =
    new ProcessBuilderDelegate(delegate.redirectError(destination))

  override def redirectError(file: File): ProcessBuilderContract =
    new ProcessBuilderDelegate(delegate.redirectError(file))

  override def redirectError: Redirect = delegate.redirectError()

  override def environment: util.Map[String, String] = delegate.environment()

  override def redirectOutput(destination: Redirect): ProcessBuilderContract =
    new ProcessBuilderDelegate(delegate.redirectOutput(destination))

  override def redirectOutput(file: File): ProcessBuilderContract =
    new ProcessBuilderDelegate(delegate.redirectOutput(file))

  override def redirectOutput: Redirect = delegate.redirectOutput()

  override def command(command: String*): ProcessBuilderContract =
    new ProcessBuilderDelegate(delegate.command(command: _*))

  override def command: util.List[String] = delegate.command

  override def redirectErrorStream: Boolean = delegate.redirectErrorStream()

  override def redirectErrorStream(redirectErrorStream: Boolean): ProcessBuilderContract =
    new ProcessBuilderDelegate(delegate.redirectErrorStream(redirectErrorStream))

  override def inheritIO: ProcessBuilderContract =
    new ProcessBuilderDelegate(delegate.inheritIO())

  override def start: Process = delegate.start()
}
