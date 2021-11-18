package models

case class Review(
  id: Option[Long],
  productId: Option[Long],
  author: String,
  comment: String
) {
  override def toString: String = {
    "Review { id: " + id + " ,productId: " +
      productId.getOrElse(0) + ", author: " +
      author + ",comment: " + comment + " }"
  }
}
