package com.seanshubin.contract.test

import java.io.{BufferedReader, BufferedWriter, InputStream, OutputStream}
import java.lang.Iterable
import java.nio.channels.SeekableByteChannel
import java.nio.charset.Charset
import java.nio.file.DirectoryStream.Filter
import java.nio.file._
import java.nio.file.attribute.{FileAttribute, FileTime, _}
import java.util
import java.util.function.BiPredicate
import java.util.stream.Stream

import com.seanshubin.contract.domain.FilesContract

trait FilesNotImplemented extends FilesContract {
  override def newInputStream(path: Path, options: OpenOption*): InputStream = ???

  override def newOutputStream(path: Path, options: OpenOption*): OutputStream = ???

  override def newByteChannel(path: Path, options: util.Set[_ <: OpenOption], attrs: FileAttribute[_]*): SeekableByteChannel = ???

  override def newByteChannel(path: Path, options: OpenOption*): SeekableByteChannel = ???

  override def newDirectoryStream(dir: Path): DirectoryStream[Path] = ???

  override def newDirectoryStream(dir: Path, glob: String): DirectoryStream[Path] = ???

  override def newDirectoryStream(dir: Path, filter: Filter[_ >: Path]): DirectoryStream[Path] = ???

  override def createFile(path: Path, attrs: FileAttribute[_]*): Path = ???

  override def createDirectory(dir: Path, attrs: FileAttribute[_]*): Path = ???

  override def createDirectories(dir: Path, attrs: FileAttribute[_]*): Path = ???

  override def createTempFile(dir: Path, prefix: String, suffix: String, attrs: FileAttribute[_]*): Path = ???

  override def createTempFile(prefix: String, suffix: String, attrs: FileAttribute[_]*): Path = ???

  override def createTempDirectory(dir: Path, prefix: String, attrs: FileAttribute[_]*): Path = ???

  override def createTempDirectory(prefix: String, attrs: FileAttribute[_]*): Path = ???

  override def createSymbolicLink(link: Path, target: Path, attrs: FileAttribute[_]*): Path = ???

  override def createLink(link: Path, existing: Path): Path = ???

  override def delete(path: Path): Unit = ???

  override def deleteIfExists(path: Path): Boolean = ???

  override def copy(source: Path, target: Path, options: CopyOption*): Path = ???

  override def move(source: Path, target: Path, options: CopyOption*): Path = ???

  override def readSymbolicLink(link: Path): Path = ???

  override def getFileStore(path: Path): FileStore = ???

  override def isSameFile(path: Path, path2: Path): Boolean = ???

  override def isHidden(path: Path): Boolean = ???

  override def probeContentType(path: Path): String = ???

  override def getFileAttributeView[V <: FileAttributeView](path: Path, theType: Class[V], options: LinkOption*): V = ???

  override def readAttributes[A <: BasicFileAttributes](path: Path, theType: Class[A], options: LinkOption*): A = ???

  override def setAttribute(path: Path, attribute: String, value: AnyRef, options: LinkOption*): Path = ???

  override def getAttribute(path: Path, attribute: String, options: LinkOption*): AnyRef = ???

  override def readAttributes(path: Path, attributes: String, options: LinkOption*): util.Map[String, AnyRef] = ???

  override def getPosixFilePermissions(path: Path, options: LinkOption*): util.Set[PosixFilePermission] = ???

  override def setPosixFilePermissions(path: Path, perms: util.Set[PosixFilePermission]): Path = ???

  override def getOwner(path: Path, options: LinkOption*): UserPrincipal = ???

  override def setOwner(path: Path, owner: UserPrincipal): Path = ???

  override def isSymbolicLink(path: Path): Boolean = ???

  override def isDirectory(path: Path, options: LinkOption*): Boolean = ???

  override def isRegularFile(path: Path, options: LinkOption*): Boolean = ???

  override def getLastModifiedTime(path: Path, options: LinkOption*): FileTime = ???

  override def setLastModifiedTime(path: Path, time: FileTime): Path = ???

  override def size(path: Path): Long = ???

  override def exists(path: Path, options: LinkOption*): Boolean = ???

  override def notExists(path: Path, options: LinkOption*): Boolean = ???

  override def isReadable(path: Path): Boolean = ???

  override def isWritable(path: Path): Boolean = ???

  override def isExecutable(path: Path): Boolean = ???

  override def walkFileTree(start: Path, options: util.Set[FileVisitOption], maxDepth: Int, visitor: FileVisitor[_ >: Path]): Path = ???

  override def walkFileTree(start: Path, visitor: FileVisitor[_ >: Path]): Path = ???

  override def newBufferedReader(path: Path, cs: Charset): BufferedReader = ???

  override def newBufferedReader(path: Path): BufferedReader = ???

  override def newBufferedWriter(path: Path, cs: Charset, options: OpenOption*): BufferedWriter = ???

  override def newBufferedWriter(path: Path, options: OpenOption*): BufferedWriter = ???

  override def copy(in: InputStream, target: Path, options: CopyOption*): Long = ???

  override def copy(source: Path, out: OutputStream): Long = ???

  override def readAllBytes(path: Path): Array[Byte] = ???

  override def readAllLines(path: Path, cs: Charset): util.List[String] = ???

  override def readAllLines(path: Path): util.List[String] = ???

  override def write(path: Path, bytes: Array[Byte], options: OpenOption*): Path = ???

  override def write(path: Path, lines: Iterable[_ <: CharSequence], cs: Charset, options: OpenOption*): Path = ???

  override def write(path: Path, lines: Iterable[_ <: CharSequence], options: OpenOption*): Path = ???

  override def list(dir: Path): Stream[Path] = ???

  override def walk(start: Path, maxDepth: Int, options: FileVisitOption*): Stream[Path] = ???

  override def walk(start: Path, options: FileVisitOption*): Stream[Path] = ???

  override def find(start: Path, maxDepth: Int, matcher: BiPredicate[Path, BasicFileAttributes], options: FileVisitOption*): Stream[Path] = ???

  override def lines(path: Path, cs: Charset): Stream[String] = ???

  override def lines(path: Path): Stream[String] = ???
}
