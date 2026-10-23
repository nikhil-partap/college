public class Skill {
    private int skillId;
    private String name;
    private String category;

    public Skill(int skillId, String name, String category) {
        this.skillId = skillId;
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkillId() {
        return skillId;
    }

    public String getCategory() {
        return category;
    }
}
