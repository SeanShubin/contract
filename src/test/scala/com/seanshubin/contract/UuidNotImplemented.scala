package com.seanshubin.contract

import java.util.UUID

trait UuidNotImplemented extends UuidContract {
  override def randomUUID: UUID = ???

  override def nameUUIDFromBytes(name: Array[Byte]): UUID = ???

  override def fromString(name: String): UUID = ???
}
