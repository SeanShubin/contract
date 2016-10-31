package com.seanshubin.contract.test

import java.util.UUID

import com.seanshubin.contract.domain.UuidContract

trait UuidNotImplemented extends UuidContract {
  override def randomUUID: UUID = ???

  override def nameUUIDFromBytes(name: Array[Byte]): UUID = ???

  override def fromString(name: String): UUID = ???
}
