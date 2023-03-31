package otherMapProblems;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.*;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // броят на героите
        Map<String, List<Integer>> herosList = new LinkedHashMap<>(); //Списък "hero" -> "hp" - hit points
                                                                            //             -> "mp" - mana points

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine(); // "{hero name} {HP} {MP}"
            String name = input.split(" ")[0];
            int hp = Integer.parseInt(input.split(" ")[1]);
            int mp = Integer.parseInt(input.split(" ")[2]);

            if (hp > 100){
                hp = 100;
            }
            if (mp > 200){
                mp = 200;
            }
            List<Integer> current = new ArrayList<>();
            current.add(hp);
            current.add(mp);
            herosList.put(name, current);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] data = command.split(" - ");

            //CastSpell – {hero name} – {MP needed} – {spell name}
            if (data[0].equals("CastSpell")){
                String heroName = data[1];
                int mpNeeded = Integer.parseInt(data[2]);
                String spellName = data[3];
                int currentMp = herosList.get(heroName).get(1);
                if (currentMp >= mpNeeded){
                    herosList.get(heroName).set(1, currentMp - mpNeeded);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, currentMp - mpNeeded);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }
            }
            //TakeDamage – {hero name} – {damage} – {attacker}
            if (data[0].equals("TakeDamage")){
                String heroName = data[1];
                int damage = Integer.parseInt(data[2]);
                String attacker = data[3];
                int currentHp = herosList.get(heroName).get(0);
                int hpAfterAttack = currentHp - damage;
                if (hpAfterAttack > 0){
                    herosList.get(heroName).set(0, hpAfterAttack);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, hpAfterAttack);
                } else {
                    herosList.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                }
            }
            //Recharge – {hero name} – {amount}
            if (data[0].equals("Recharge")){
                String heroName = data[1];
                int amount = Integer.parseInt(data[2]);
                int currentMp = herosList.get(heroName).get(1);
                int mpAfterRecharge = currentMp + amount;
                // максимум 200 МП
                if (mpAfterRecharge > 200){
                    herosList.get(heroName).set(1, 200);
                    System.out.printf("%s recharged for %d MP!%n", heroName, 200 - currentMp);
                } else {
                    herosList.get(heroName).set(1, mpAfterRecharge);
                    System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                }
            }
            //Heal – {hero name} – {amount}
            if (data[0].equals("Heal")){
                String name = data[1];
                int amount = Integer.parseInt(data[2]);
                int curentHp = herosList.get(name).get(0);
                int hpAfterHeal = curentHp + amount;
                if (hpAfterHeal > 100){
                    herosList.get(name).set(0, 100);
                    System.out.printf("%s healed for %d HP!%n", name, 100 - curentHp);
                } else {
                    herosList.get(name).set(0, hpAfterHeal);
                    System.out.printf("%s healed for %d HP!%n", name, amount);
                }
            }

            command = scanner.nextLine();
        }

        herosList.entrySet().forEach(e -> System.out.printf("%s%n  HP: %d%n  MP: %d%n", e.getKey(), e.getValue().get(0), e.getValue().get(1)));

    }
}
