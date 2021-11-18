package models

case class Image(
  id: Option[Long],
  productId: Option[Long],
  url: String
) {
  override def toString: String = {
    "Image { productId: " + productId.getOrElse(0) +
      ",url: " + url + "}"
  }
}
