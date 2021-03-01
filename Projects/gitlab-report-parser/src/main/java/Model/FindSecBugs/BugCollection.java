package Model.FindSecBugs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BugCollection {
    private List<BugInstance> bugList;

    /**
     * a bug collection is a list of bug instances
     **/

    public BugCollection() {
        this.bugList = new ArrayList<>();
    }

    public List<BugInstance> getBugList() {
        return bugList;
    }

    public boolean addToBugList(BugInstance bi) {
        return this.bugList.add(bi);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BugCollection)) return false;

        BugCollection that = (BugCollection) o;

        return getBugList().equals(that.getBugList());
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        Iterator i = getBugList().iterator();
        while (i.hasNext()) {
            Object obj = i.next();
            hashCode = hashCode + (obj == null ? 0 : obj.hashCode());
        }
        return hashCode;
    }
}
