//2차 과제 . 수정본
package kookmin_RPG;

//
import java.util.Scanner;

class Hero {
	// 필드
	int hero_level, hero_power, hero_mp, hero_hp, hero_defense, hero_experience, hero_money;
	String hero_name;
	String hero_job;

	// 생성자

	Hero() {

		this.hero_level = 1;
		this.hero_experience = 0;
		this.hero_money = 0;
	}

	// 메소드
	Monster M = new Monster();

	void setHero(int hm) {// 숫자에 따라 히어로 직업 설정,직업 변경 시 돈과 레벨, 경험치는 유지되게 설정, 능력치만 바뀜
		if (hm == 1) {// 전사의 스텟
			this.hero_job = "전사";
			this.hero_power = 30;
			this.hero_defense = 15;
			this.hero_hp = 160;
			this.hero_mp = 0;
		} else if (hm == 2) {// 마법사의 스텟
			this.hero_job = "마법사";
			this.hero_power = 15;
			this.hero_defense = 15;
			this.hero_hp = 80;
			this.hero_mp = 150;
		} else if (hm == 3) {// 궁수의 스텟
			this.hero_job = "궁수";
			this.hero_power = 35;
			this.hero_defense = 10;
			this.hero_hp = 90;
			this.hero_mp = 50;
		} else if (hm == 4) {// 중기갑병의 스텟 / 중기갑병은 레벨 5부터 사용가능
			this.hero_job = "중기갑병";
			this.hero_power = 20;
			this.hero_defense = 70;
			this.hero_hp = 200;
			this.hero_mp = 0;
		}
	}

	int hero_attack() { // 히어로 공격 시 딜량 계산
		Scanner skill = new Scanner(System.in);

		if (hero_job.equals("전사")) {
			System.out.println("사용가능 스킬\n1. 삼단 베기\n(힘에 비례 데미지)\n\n2. 찌르기\n(레벨에 비례 데미지)");
			if (hero_level >= 3) {// 레벨 3 이상이면 새 스킬 추가됨
				System.out.println("\n\n3. 영혼 베기\n(mp에 비례 데미지)");
				// 이 스킬은 데미지에 mp계수 반영
			}
			System.out.print("스킬 번호를 입력하세요 :");
			int skillnum = skill.nextInt();
			if (skillnum == 1) {
				int dam = hero_level * 10 + hero_power * 40 + hero_mp * 0;// 힘이 셀수록 위력증가
				return dam;
			} else if (skillnum == 2) {
				int dam = hero_level * 30 + hero_power * 10 + hero_mp * 0;// 레벨이 높을수록 위력증가
				return dam;
			} else if (skillnum == 3 && (hero_level >= 3)) {
				int dam = hero_level * 10 + hero_power * 10 + hero_mp * 50;// 마나도 공격에 포함되게 수정, 마나에 데미지 비중큼
				return dam;
			}
		} else if (hero_job.equals("마법사")) {// 마법사
			System.out.println("사용가능 스킬\n1. 파이어 볼\n(마나 비례 데미지)\n\n2. 정신 집중\n(마나 증가)");
			if (hero_level >= 3) {// 레벨 3 이상시 스킬 추가
				System.out.println("\n\n3. 베리어\n(방어력 증가)");
			}
			System.out.print("스킬 번호를 입력하세요 :");
			int skillnum = skill.nextInt();
			if (skillnum == 1) {// 파이어볼
				int dam = hero_level * 10 + hero_power * 0 + hero_mp * 40;// 마나 비례
				return dam;
			} else if (skillnum == 2) {
				int dam = 22000;// 마나 증가
				return dam;
			} else if (skillnum == 3 && (hero_level >= 3)) {// 레벨 3 이상시 스킬 추가
				int dam = 23000;// 방어력이 마나에 비례해서 증가
				return dam;
			}

		} else if (hero_job.equals("궁수")) {
			System.out.println("사용가능 스킬\n1. 연사\n(힘에 비례 데미지)\n\n2. 회피\n(다음 공격 회피)");
			if (hero_level >= 3) {// 레벨 3 이상이면 스킬 추가
				System.out.println("\n\n3. 정수 약탈자\n(mp에 비례 데미지)");
			}
			System.out.print("스킬 번호를 입력하세요 :");
			int skillnum = skill.nextInt();
			if (skillnum == 1) {
				int dam = hero_level * 10 + hero_power * 40 + hero_mp * 0;// 힘이 셀수록 위력증가
				return dam;
			} else if (skillnum == 2) {
				int dam = 32000;// 공격 회피
				return dam;
			} else if (skillnum == 3 && hero_level >= 3) { // 레벨 3 이상이면 스킬 추가
				int dam = hero_level * 10 + hero_power * 10 + hero_mp * 40;// 마나도 공격에 포함되게 수정, 마나에 데미지 비중큼
				return dam;
			}
		} else if (hero_job.equals("중기갑병")) {
			System.out.println("사용가능 스킬\n1. 버티기\n(방어력 증가)\n\n2. 돌진\n(힘에 비례 데미지)");
			if (hero_level >= 3) {
				System.out.println("\n\n3. 분쇄\n(레벨, 힘 비례 데미지)");
			}
			System.out.println();
			System.out.print("스킬 번호를 입력하세요 :");
			int skillnum = skill.nextInt();
			if (skillnum == 1) {
				int dam = 41000;// 방어력 증가
				return dam;
			} else if (skillnum == 2) {
				int dam = hero_level * 10 + hero_power * 40 + hero_mp * 0;// 힘 비례 데미지
				return dam;
			} else if (skillnum == 3 && hero_level >= 3) {
				int dam = hero_level * 25 + hero_power * 25 + hero_mp * 0;// 레벨 힘 비례 데미지
				return dam;
			}
		}
		int dam = hero_level * 10 + hero_power * 30;
		return dam;

	}

	void hero_attacked(int sum) {// 히어로 받은 피해 후 남은 체력
		if (hero_defense >= sum) {// 방어력이 높으면 체력 유지
		} else {
			hero_hp = hero_hp + hero_defense - sum;
			System.out.printf("남은 히어로의 체력은 %d입니다", hero_hp);
		}
	}

	// 상황 표시 메소드
	void info() {
		System.out.printf(
				"현재 Hero 의 이름 : %s\n현재 %s의 레벨 : %d\n현재 %s의 힘 : %d\n현재 %s의 방어력 : %d\n현재 %s의 HP : %d\n현재 %s의 MP : %d\n현재 %s의 경험치 : %d\n현재 %s의 돈 : %d원",
				hero_name, hero_name, hero_level, hero_name, hero_power, hero_name, hero_defense, hero_name, hero_hp,
				hero_name, hero_mp, hero_name, hero_experience, hero_name, hero_money);
		System.out.println();
		System.out.println("*****************************");
	}

	// 레벨 업 메소드
	void levelUp() {
		if (hero_experience >= hero_level * 70) {// 레벨업 조건
			System.out.println();
			hero_level += 1; // 레벨 증가
			System.out.printf("%s의 레벨이 %d(이)가 되었습니다.", hero_name, hero_level);
			System.out.println();
			hero_money += hero_level * 50; // 돈 증가
			System.out.printf("레벨 업 기념으로 돈이 %d원 증가하여 %d원이 되었습니다", hero_level * 50, hero_money); // 메세지 출력
			System.out.println();
			hero_experience = 0; // 경험치 초기화

		}
	}

	void ChooseJob() {// 직업 변경, 선택 메소드
		if (hero_level >= 5) {// 레벨 5 이상이면 중기갑병 사용 가능
			System.out.println("1. 전사\n2. 마법사\n3. 궁수\n4. 중기갑병");
			System.out.println("원하시는 직업의 번호를 입력하세요 :");
			Scanner jobnum2 = new Scanner(System.in);
			int jn2 = jobnum2.nextInt();
			if (jn2 == 1) {
				setHero(jn2);
				System.out.println("직업이 전사인채로 진행됩니다.");
				info();
			} else if (jn2 == 2) {
				setHero(jn2);
				System.out.println("직업이 마법사인채로 진행됩니다.");
				info();
			} else if (jn2 == 3) {
				setHero(jn2);
				System.out.println("직업이 궁수인채로 진행됩니다. ");
				info();
			} else if (jn2 == 4) {
				setHero(jn2);
				System.out.println("직업이 중기갑병인채로 진행됩니다.");
				info();
			}
		} else if (hero_level >= 3) { // 레벨 3 이상이면 전사, 마법사, 궁수만 가능

			System.out.println("1. 전사\n2. 마법사\n3. 궁수");
			System.out.println("원하시는 직업의 번호를 입력하세요 :");
			Scanner jobnum = new Scanner(System.in);
			int jn = jobnum.nextInt();
			if (jn == 1) {
				System.out.println("직업이 전사인채로 진행됩니다.");
				setHero(jn);
				info();
			} else if (jn == 2) {
				System.out.println("직업이 마법사인채로 진행됩니다.");
				setHero(jn);
				info();
			} else if (jn == 3) {
				System.out.println("직업이 궁수인채로 진행됩니다.");
				setHero(jn);
				info();
			}

		} else if (hero_level >= 1 && hero_level < 3) { // 레벨 1~2면 전사만 사용가능
			System.out.println("레벨이 부족하여 전사만 사용하실수 있습니다.");
			System.out.println("1. 전사");

		}
	}

	void help() {// 직업에 대한 초반 스텟 정보
		System.out.println("********도움말********\n\n직업은 전사, 마법사, 궁수, 중기갑병이 있으며 "
				+ "\n레벨3부터 마법사와 궁수가 해제되고 \n레벨5 이상부터는 모든 직업 사용이 가능합니다.\n"
				+ "직업별 초반 스텟 :\n1. 전사\n체력 : 160\n힘 : 30\n방어력 : 15\n마나 : 0\n\n"
				+ "2. 마법사\n체력 : 80\n힘 : 15\n방어력 : 15\n마나 : 150\n\n" + "3. 궁수\n체력 : 90\n힘 : 35\n방어력 : 10\n마나 : 50\n\n"
				+ "4. 중기갑병\n체력 : 200\n힘 : 20\n방어력 : 70\n마나 : 0\n\n" + "모든 직업은 3레벨 이상이 되면 특성 스킬이 해제됩니다.");
	}
}

class Monster {
	int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;
	String monster_name;

	void setMonster(int mn) { // 몬스터 스텟 설정 메소드
		if (mn == 1) {// 너구리
			this.monster_name = "너구리";
			this.monster_hp = 100;
			this.monster_mp = 0;
			this.monster_level = 1;
			this.monster_power = 20;
			this.monster_defense = 5;
			this.monster_money = 10;
			this.monster_experience = 10;

		} else if (mn == 2) {// 살쾡이
			this.monster_name = "살쾡이";
			this.monster_hp = 2000;
			this.monster_mp = 0;
			this.monster_level = 5;
			this.monster_power = 100;
			this.monster_defense = 20;
			this.monster_money = 30;
			this.monster_experience = 50;

		} else if (mn == 3) {// 들개
			this.monster_name = "들개";
			this.monster_hp = 2000;
			this.monster_mp = 0;
			this.monster_level = 5;
			this.monster_power = 100;
			this.monster_defense = 20;
			this.monster_money = 30;
			this.monster_experience = 50;

		} else if (mn == 4) {// 멧돼지
			this.monster_name = "멧돼지";
			this.monster_hp = 3000;
			this.monster_mp = 50;
			this.monster_level = 15;
			this.monster_power = 150;
			this.monster_defense = 30;
			this.monster_money = 40;
			this.monster_experience = 150;

		}
	}

	// 몬스터 공격 딜량 계산
	int monster_attack() {
		int k2 = monster_power + monster_mp;
		return k2;
	}

	// 몬스터 받은 피해 후 남은 체력
	void monster_attacked(int sum) {
		if (monster_defense >= sum) {
		} else {
			monster_hp = monster_hp + monster_defense - sum;
		}
	}

}

class PotionStore {
	int cc;

	// 포션 상점 프로세스
	int potionStore_show(int potionNum) {// 포션 번호 입력시 해당 능력치 증강 효과

		if (potionNum == 1) {// 힘

			cc = 3;

		} else if (potionNum == 2) {// 방어력

			cc = 3;

		} else if (potionNum == 3) {// 경험치

			cc = 50;

		} else if (potionNum == 4) {// hp

			cc = 50;

		} else if (potionNum == 5) {// mp

			cc = 50;

		}

		return cc;
	}

}

public class RPG_2game {// 전역 변수 생성 = 히어로와 몬스터들의 능력치

	static int sum;// sum = 전투에서 주고 받을 데미지

	// Hero 클래스 내부에 히어로 공격시 딜량계산, 히어로 받은 체력 후 남은 체력, 각 스텟 설정
	// Monster 클래스 내부에 몬스터 공격 딜량계산, 몬스터 받은 피해 후 남은체력, 각 스텟 설정
	// 포션 상점 클래스

//실행
	public static void main(String[] args) {
		// 히어로 설정
		System.out.println("********RPG GAME********\n");
		Hero Hero_1 = new Hero();
		Hero_1.ChooseJob();
		System.out.print("직업의 번호를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int job_number = sc.nextInt();
		sc.nextLine();
		System.out.println("전사가 생성되었습니다.");
		System.out.print("영웅의 이름을 입력하세요 :");
		String h_name = sc.nextLine();
		// hero 능력치 셋팅
		Hero_1.hero_name = h_name;
		Hero_1.setHero(job_number);// 번호에 따른 직업 선택

// 게임 시작
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		System.out.println("*****************************");
		Hero_1.info(); // 상황정보창
		System.out.println();
		Monster M = new Monster();
		// 처음 1회는 사냥터만/ 포션 상점 x, 몬스터는 너구리만, 다음 턴부터 살쾡이 추가
		while (true) {
			System.out.println("사냥터에 입장하였습니다.");
			System.out.println("1. 너구리");
			System.out.print("전투할 상대를 입력하세요. :");
			int num = sc.nextInt();

			if (num == 1) {// 너구리로 상대 설정 시
				System.out.println("너구리와 전투를 시작합니다.");
				// 너구리 능력치 셋팅
				M.setMonster(num);
				break;
			} else {// 잘못된 대상 선택시 반복
				System.out.println("잘못된 대상입니다. 다시 선택해주세요.");
				continue;
			}
		}
		// 너구리 전투 시작
		while (M.monster_hp > 0) {
			// 히어로 공격 턴
			System.out.printf("%s의 공격입니다.", Hero_1.hero_name);
			System.out.println();

			sum = Hero_1.hero_attack(); // 히어로 딜량 계산
			if (sum == 22000) {
				System.out.println("마법사의 마나가 30만큼 증가하였습니다.");
				Hero_1.hero_mp += 30;// 마나 증가 (마법사 마나 증가 코드 22000
			} else if (sum == 23000) {
				System.out.printf("마법사의 방어력이 %d만큼 증가하였습니다.", Hero_1.hero_defense + (Hero_1.hero_mp - 120));
				Hero_1.hero_defense += (Hero_1.hero_mp / 5); // 마나에 비례해서 방어력 증가 (마법사 방어력 증가 코드 23000)
			} else if (sum == 32000) { // 회피는 다음턴 몬스터 공격을 회피/ 회피코드 32000
				System.out.println("다음 공격을 회피합니다.");

			} else if (sum == 41000) {
				Hero_1.hero_defense += 20;// 방어력 증가 ( 기갑병 방어력 증가 코드 41000)
			} else {

				System.out.printf("%s의 데미지는 %d입니다.", M.monster_name, sum);
				System.out.println();
				M.monster_attacked(sum); // 몬스터 받은 피해량
			}
			if (M.monster_hp <= 0) {// 너구리 패배 시
				System.out.printf("%s가 죽었습니다.", M.monster_name);
				Hero_1.hero_experience += M.monster_experience; // 경험치 증가
				Hero_1.hero_money += M.monster_money; // 돈 증가
				Hero_1.levelUp();// 상황에 따른 레벨업

				break;
			}
			// 몬스터 공격 턴
			System.out.printf("%s의 공격입니다", M.monster_name);
			System.out.println();
			if (sum == 32000) {// 히어로 공격 코드가 회피 코드인 경우
				System.out.println("히어로가 공격을 회피했습니다");
			} else {// 다른 코드일 경우

				sum = M.monster_attack();// 몬스터 딜량 계산
				System.out.printf("%s의 데미지는 %d입니다.", Hero_1.hero_name, sum);
				Hero_1.hero_attacked(sum);// 히어로 받은 피해량 계산
				if (Hero_1.hero_hp <= 0) {// 히어로 패배 시
					Hero_1.hero_hp = 1;// 체력이 0이나 그 아래로 내려가면 1로 초기화
					System.out.println();
					System.out.printf("%s가 부활합니다", Hero_1.hero_name);
				}
				System.out.println();
			}

		}
		// 전투 끝난 후 상황 정보 창
		System.out.println();
		System.out.println("********************");
		Hero_1.info();
// 본 전투 시작 (이제부터 상점 및 사냥터 이동 가능, 포션 구입 가능, 살쾡이 추가, 스킬 선택 가능)
		while (true) {
			System.out.println("직업을 그대로 유지하려면 1번, \n직업을 바꾸려면 2번,\n도움말이 필요하면 3번을 눌러주세요.");
			System.out.print("숫자를 입력하세요 : ");
			int option = sc.nextInt();// 직업 유지, 직업 변경, 도움말 선택
			if (option == 2) {
				Hero_1.ChooseJob();// 직업 변경

			} else if (option == 1) {// 그대로 유지
			} else if (option == 3) {// 도움말
				Hero_1.help();
			}
			System.out.println();
			System.out.println("게임을 시작합니다.");
			System.out.println("1. 사냥터 \n2. 포션 상점");
			System.out.println("입장할 장소를 입력하세요. :");
			int a = sc.nextInt();
			if (a == 1) {// 사냥터로 이동 시
				System.out.println("사냥터에 입장하였습니다.");
				System.out.println("1. 너구리 \n2. 살쾡이 \n3. 들개 \n4. 멧돼지\n전투할 상대를 입력하세요. :");
				int mon = sc.nextInt();

				M.setMonster(mon);// 몬스터 필드를 숫자에 맞게 초기화
				System.out.printf("%s와의 전투를 시작합니다.", M.monster_name);
				System.out.println();

				while (M.monster_hp > 0) {
					// 히어로 공격 턴
					System.out.printf("%s의 공격입니다.", Hero_1.hero_name);
					System.out.println();

					sum = Hero_1.hero_attack();
					if (sum == 22000) {
						System.out.println("마법사의 마나가 30만큼 증가하였습니다.");
						Hero_1.hero_mp += 30;// 마나 증가 (마법사 마나 증가 코드 22000
					} else if (sum == 23000) {
						System.out.printf("마법사의 방어력이 %d만큼 증가하였습니다.", Hero_1.hero_defense + (Hero_1.hero_mp - 120));
						Hero_1.hero_defense += (Hero_1.hero_mp / 5); // 마나에 비례해서 방어력 증가 (마법사 방어력 증가 코드 23000
					} else if (sum == 32000) {// 회피 코드 32000 , 회피 시 다음 턴 공격 데미지 X
						System.out.println("다음 공격을 회피합니다.");

					} else if (sum == 41000) {
						Hero_1.hero_defense += 20;// 방어력 증가 ( 기갑병 방어력 증가 코드 41000)
					} else {

						System.out.printf("%s의 데미지는 %d입니다.", M.monster_name, sum);
						System.out.println();
						M.monster_attacked(sum); // 몬스터 받은 피해량
					}

					if (M.monster_hp <= 0) {// 몬스터 패배 시
						System.out.printf("%s가 죽었습니다.", M.monster_name);
						Hero_1.hero_experience += M.monster_experience;
						Hero_1.hero_money += M.monster_money;
						Hero_1.levelUp();
						System.out.println();
						System.out.println("********************");

						break;
					}
					// 몬스터 공격 턴
					System.out.println();
					System.out.printf("%s의 공격입니다", M.monster_name);
					System.out.println();
					if (sum == 32000) {// 회피 코드시
						System.out.println("히어로가 공격을 회피했습니다");
					} else {
						sum = M.monster_attack();
						System.out.printf("%s의 데미지는 %d입니다.", Hero_1.hero_name, sum);
						Hero_1.hero_attacked(sum);
						if (Hero_1.hero_hp <= 0) {// 히어로 패배 시
							Hero_1.hero_hp = 1;
							System.out.println();
							System.out.printf("%s가 부활합니다", Hero_1.hero_name);
							System.out.println();
							System.out.println("********************");
							break;
						}

					}

					System.out.println();

				}

				// 전투 끝난 후 상황 정보 창
				System.out.println();
				System.out.println("********************");
				Hero_1.info();
			} else if (a == 2) {// 포션 상점으로 이동 시
				System.out.println("포션 상점에 입장하였습니다.");
				System.out.println(
						"1. 힘 증강 포션 (30원) \n2. 방어력 증강 포션 (30원) \n3. 경험치 증강 포션 (100원) \n4. HP 증강 포션 (10원) \n5. MP 증강 포션 (10원) \n원하시는 물건을 입력하세요. :");
				int potionNum = sc.nextInt();
				PotionStore Po = new PotionStore();
				int money; // 지불 금액
				switch (potionNum) {

				case 1:// 힘 포션
					money = 30;
					Hero_1.hero_money -= money;
					if (Hero_1.hero_money >= 0) {
						System.out.println("포션 상점에서 물건을 구매 시도 하는 중입니다.\n구입이 완료되었습니다.");
						System.out.printf("%d원 남았습니다", Hero_1.hero_money);
						System.out.println();
						Hero_1.hero_power += Po.potionStore_show(potionNum);

					} else {
						System.out.println("돈이 부족합니다.");
						Hero_1.hero_money += money;
					}
					break;
				case 2:// 방어력 포션
					money = 30;
					Hero_1.hero_money -= money;
					if (Hero_1.hero_money >= 0) {
						System.out.println("포션 상점에서 물건을 구매 시도 하는 중입니다.\n구입이 완료되었습니다.");
						System.out.printf("%d원 남았습니다", Hero_1.hero_money);
						System.out.println();
						Hero_1.hero_defense += Po.potionStore_show(potionNum);
					} else {
						System.out.println("돈이 부족합니다.");
						Hero_1.hero_money += money;
					}
					break;
				case 3:// 경험치 포션
					money = 100;
					Hero_1.hero_money -= money;
					if (Hero_1.hero_money >= 0) {
						System.out.println("포션 상점에서 물건을 구매 시도 하는 중입니다.\n구입이 완료되었습니다.");
						System.out.printf("%d원 남았습니다", Hero_1.hero_money);
						System.out.println();
						Hero_1.hero_experience += Po.potionStore_show(potionNum);
						// 이때 경험치 포션으로 인한 경험치 증가시 레벨업 조건 달성시 레벨업
						Hero_1.levelUp();
					} else {
						System.out.println("돈이 부족합니다.");
						Hero_1.hero_money += money;
					}
					break;
				case 4:// 체력 포션
					money = 10;
					Hero_1.hero_money -= money;
					if (Hero_1.hero_money >= 0) {
						System.out.println("포션 상점에서 물건을 구매 시도 하는 중입니다.\n구입이 완료되었습니다.");
						System.out.printf("%d원 남았습니다", Hero_1.hero_money);
						System.out.println();
						Hero_1.hero_hp += Po.potionStore_show(potionNum);
					} else {
						System.out.println("돈이 부족합니다.");
						Hero_1.hero_money += money;
					}
					break;
				case 5:// 마나 포션
					money = 10;
					Hero_1.hero_money -= money;
					if (Hero_1.hero_money >= 0) {
						System.out.println("포션 상점에서 물건을 구매 시도 하는 중입니다.\n구입이 완료되었습니다.");
						System.out.printf("%d원 남았습니다", Hero_1.hero_money);
						System.out.println();
						Hero_1.hero_mp += Po.potionStore_show(potionNum);
					} else {
						System.out.println("돈이 부족합니다.");
						Hero_1.hero_money += money;
					}
					break;
				default:
					System.out.println("다시 선택해 주세요.");
					break;

				}
				System.out.println();
				System.out.println("********************");
				Hero_1.info();

			}

		}
	}
}