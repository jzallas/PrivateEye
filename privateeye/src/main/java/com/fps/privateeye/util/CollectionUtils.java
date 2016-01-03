package com.fps.privateeye.util;

import java.util.Collection;

public class CollectionUtils {

  public static <E> boolean isWithinBounds(Collection<E> collection, int position) {
    final boolean outOfBounds = position < 0 || position >= collection.size();
    return !outOfBounds;
  }
}
