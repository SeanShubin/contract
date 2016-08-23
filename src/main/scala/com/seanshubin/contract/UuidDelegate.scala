package com.seanshubin.contract

import java.util.UUID

object UuidDelegate extends UuidContract {
  override def randomUUID: UUID = UUID.randomUUID()

  override def nameUUIDFromBytes(name: Array[Byte]): UUID = UUID.nameUUIDFromBytes(name)

  override def fromString(name: String): UUID = UUID.fromString(name)
}
