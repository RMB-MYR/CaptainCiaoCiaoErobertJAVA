import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class compareElementsA15_2_4 {
    public static void main(String[] args) {
        System.out.println(Guest.allGuestsHaveSimiliarInterests(Arrays.asList(new Guest(true, true, true),
                new Guest(true, false, false))));
    }


    public static class Guest {
        public boolean likesToShoot;
        public boolean likesToGamble;
        public boolean likesBlackmail;

        public Guest(boolean likesToShoot, boolean likesToGamble, boolean likesBlackmail) {
            this.likesToShoot = likesBlackmail;
            this.likesToGamble = likesToGamble;
            this.likesBlackmail = likesBlackmail;

        }

        public boolean hasDissimilarInterests(Guest other) {
            return !(likesToShoot == other.likesToShoot ||
                    likesToGamble == other.likesToGamble ||
                    likesBlackmail == other.likesBlackmail); // OR > ||
        }

        public static int allGuestsHaveSimiliarInterests(List<Guest> guests) {
            for (int i = 0; i < guests.size(); i++) {
                Guest guest = guests.get(i);
                Guest other = guests.get((i + 1 % guests.size()));
                if (guest.hasDissimilarInterests(other))
                    return i;
            }
            return -1;
        }
    }
}


