import java.util.List;

class PaginationHelper<I> {
  private final int listSize;
  private final int pageSize;

  PaginationHelper(List<I> collection, int itemsPerPage) {
    listSize = collection.size();
    pageSize = itemsPerPage;
  }

  int itemCount() {
    return listSize;
  }

  int pageCount() {
    return itemCount() / pageSize + 1;
  }

  int pageItemCount(int pageIndex) {
    return pageIndex < pageCount() ? pageIndex < pageCount() - 1 ? pageSize : itemCount() - pageSize * pageIndex : -1;
  }

  int pageIndex(int itemIndex) {
    return itemIndex >= 0 && itemIndex < itemCount() ? itemIndex / pageSize : -1;
  }
}