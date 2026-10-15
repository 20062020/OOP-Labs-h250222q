import java.util.*;

public class Library {
    private final Map<String, LibraryItem> items = new HashMap<>();
    private final Map<String, Member> members = new HashMap<>();

    public void borrow(String memberId, String itemId)
            throws ItemNotAvailableException, MemberLimitExceededException {
        // 1. look up member and item (throw IllegalArgumentException if missing)
        // 2. check availability and the member's loan limit
        // 3. create a Loan, mark the item unavailable, record it on the member
    }

    public List<LibraryItem> searchByTitle(String text) {
        return items.values().stream()
                .filter(i -> i.getTitle().toLowerCase().contains(text.toLowerCase()))
                .sorted(Comparator.comparing(LibraryItem::getTitle))
                .toList();
    }
}