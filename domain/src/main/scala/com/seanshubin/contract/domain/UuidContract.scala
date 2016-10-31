package com.seanshubin.contract.domain

import java.util.UUID

trait UuidContract {
  def randomUUID: UUID

  def nameUUIDFromBytes(name: Array[Byte]): UUID

  def fromString(name: String): UUID
}
