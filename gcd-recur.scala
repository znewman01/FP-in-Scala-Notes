def gcd(x: Long, y: Long): Long =
  if (y == 0) x else gcd(y, x % y)
