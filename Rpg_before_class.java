package kookmin_RPG;

import java.util.Scanner;

public class Rpg_before_class {// 전역 변수 생성 = 히어로와 몬스터들의 능력치
	static int hero_level, hero_power, hero_mp, hero_hp, hero_defense, hero_experience, hero_money;
	static int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money,
			sum;// sum = 전투에서 주고 받을 데미지

	static String hero_name, monster_name;// 히어로, 몬스터의 이름

	// 정적 메소드 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// 히어로 공격 시 딜량 계산
	static int hero_attack() {
		int k = hero_level * 10 + hero_power * 30;
		return k;
	}

	// 히어로 받은 피해 후 남은 체력
	static void hero_attacked(int sum) {
		if (hero_defense >= monster_power) {// 방어력이 높으면 체력 유지
		} else {
			hero_hp = hero_hp + hero_defense - monster_power;
		}
	}

	// 몬스터 공격 딜량 계산
	static int monster_attack() {
		int k2 = monster_power;
		return k2;
	}

	// 몬스터 받은 피해 후 남은 체력
	static void monster_attacked(int sum) {
		if (monster_defense >= sum) {
		} else {
			monster_hp = monster_hp + monster_defense - sum;
		}
	}

	// 상황 표시 메소드
	static void info() {
		System.out.printf(
				"현재 Hero 의 이름 : %s\n현재 %s의 레벨 : %d\n현재 %s의 힘 : %d\n현재 %s의 방어력 : %d\n현재 %s의 HP : %d\n현재 %s의 MP : %d\n현재 %s의 경험치 : %d\n현재 %s의 돈 : %d원",
				hero_name, hero_name, hero_level, hero_name, hero_power, hero_name, hero_defense, hero_name, hero_hp,
				hero_name, hero_mp, hero_name, hero_experience, hero_name, hero_money);
		System.out.println();
		System.out.println("********************");

	}

//레벨 업 메소드
	static void levelUp() {
		if (hero_experience >= hero_level * 80) {// 레벨업 조건
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

// 포션 상점 프로세스
	static int potionStore_show(int potionNum) {// 포션 번호 입력시 해당 능력치 증강 효과

		int cc = 0; // cc는 상태변화에 사용될 변수
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

//실행
	public static void main(String[] args) {
		// 히어로 설정
		System.out.print("영웅의 이름을 입력하세요. :");
		Scanner sc = new Scanner(System.in);
		hero_name = sc.nextLine();
		// hero 능력치 셋팅
		hero_level = 1;
		hero_power = 15;
		hero_defense = 25;
		hero_hp = 80;
		hero_experience = 0;
		hero_money = 0;
// 게임 시작
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		System.out.println("*****************************");
		info(); // 상황정보창
		System.out.println();
		System.out.println("*****************************");

// 처음 1회는 사냥터만/ 포션 상점 x, 몬스터는 너구리만, 다음 턴부터 살쾡이 추가
		while (true) {
			System.out.println("사냥터에 입장하였습니다.");
			System.out.println("1. 너구리");
			System.out.print("전투할 상대를 입력하세요. :");
			int num = sc.nextInt();

			if (num == 1) {// 너구리로 상대 설정 시
				System.out.println("너구리와 전투를 시작합니다.");
				// 너구리 능력치 셋팅
				monster_name = "너구리";
				monster_hp = 100;
				monster_mp = 0;
				monster_level = 1;
				monster_power = 20;
				monster_defense = 5;
				monster_money = 10;
				monster_experience = 10;
				break;
			} else {// 잘못된 대상 선택시 반복
				System.out.println("잘못된 대상입니다. 다시 선택해주세요.");
				continue;
			}
		}
		// 너구리 전투 시작
		while (monster_hp > 0) {
// 히어로 공격 턴
			System.out.printf("%s의 공격입니다.", hero_name);
			System.out.println();
			sum = hero_attack(); // 히어로 딜량 계산
			System.out.printf("%s의 데미지는 %d입니다.", monster_name, sum);
			System.out.println();
			monster_attacked(sum); // 몬스터 받은 피해량
			if (monster_hp <= 0) {// 너구리 패배 시
				System.out.printf("%s가 죽었습니다.", monster_name);
				hero_experience += monster_experience; // 경험치 증가
				hero_money += monster_money; // 돈 증가
				levelUp();// 상황에 따른 레벨업

				break;
			}
//몬스터 공격 턴
			System.out.printf("%s의 공격입니다", monster_name);
			System.out.println();
			sum = monster_attack();// 몬스터 딜량 계산
			System.out.printf("%s의 데미지는 %d입니다.", hero_name, sum);
			hero_attacked(sum);// 히어로 받은 피해량 계산
			if (hero_hp <= 0) {// 히어로 패배 시
				hero_hp = 1;// 체력이 0이나 그 아래로 내려가면 1로 초기화
				System.out.println();
				System.out.printf("%s가 부활합니다", hero_name);
			}
			System.out.println();

		}
// 전투 끝난 후 상황 정보 창
		System.out.println();
		System.out.println("********************");
		info();

// 본 전투 시작 (이제부터 상점 및 사냥터 이동 가능, 포션 구입 가능, 살쾡이 추가, 스킬 선택 가능)

		while (true) {
			System.out.println();

			System.out.println("1. 사냥터 \n2. 포션 상점");
			System.out.println("입장할 장소를 입력하세요. :");

			int a = sc.nextInt(); // 장소 입력 1 or 2

			if (a == 1) {// 사냥터로 이동 시
				System.out.println("사냥터에 입장하였습니다.");
				System.out.println("1. 너구리 \n2. 살쾡이 \n전투할 상대를 입력하세요. :");
				int mon = sc.nextInt();
				if (mon == 1) {// 너구리를 상대로 설정 시
					System.out.println("너구리와 전투를 시작합니다.");
					monster_name = "너구리";
					monster_hp = 100;
					monster_mp = 0;
					monster_level = 1;
					monster_power = 20;
					monster_defense = 5;
					monster_money = 10;
					monster_experience = 10;
					System.out.println("너구리와의 전투를 시작합니다.");
					while (monster_hp > 0) {
						// 히어로 공격 턴
						System.out.printf("%s의 공격입니다.", hero_name);
						System.out.println();
						sum = hero_attack();
						System.out.printf("%s의 데미지는 %d입니다.", monster_name, sum);
						System.out.println();
						monster_attacked(sum);
						if (monster_hp <= 0) {// 너구리 패배 시
							System.out.printf("%s가 죽었습니다.", monster_name);
							hero_experience += monster_experience;
							hero_money += monster_money;
							levelUp();
							System.out.println();
							System.out.println("********************");

							break;
						}
						// 몬스터 공격 턴
						System.out.printf("%s의 공격입니다", monster_name);
						System.out.println();
						sum = monster_attack();
						System.out.printf("%s의 데미지는 %d입니다.", hero_name, sum);
						hero_attacked(sum);
						if (hero_hp <= 0) {// 히어로 패배 시
							hero_hp = 1;
							System.out.println();
							System.out.printf("%s가 부활합니다", hero_name);
							System.out.println();
							System.out.println("********************");
							break;
						}
						System.out.println();

					}
				} else if (mon == 2) {// 살쾡이를 상대로 설정 시
					System.out.println("살쾡이와 전투를 시작합니다.");
					monster_name = "살쾡이";
					monster_hp = 2000;
					monster_mp = 0;
					monster_level = 5;
					monster_power = 100;
					monster_defense = 20;
					monster_money = 30;
					monster_experience = 50;
					System.out.println("살쾡이와의 전투를 시작합니다.");
					while (monster_hp > 0) {
						// 히어로 공격 턴
						System.out.printf("%s의 공격입니다.", hero_name);
						System.out.println();
						sum = hero_attack();
						System.out.printf("%s의 데미지는 %d입니다.", monster_name, sum);
						System.out.println();
						monster_attacked(sum);
						if (monster_hp <= 0) {// 살쾡이 패배 시
							System.out.printf("%s가 죽었습니다.", monster_name);
							hero_experience += monster_experience;
							hero_money += monster_money;
							levelUp();
							System.out.println();
							System.out.println("********************");
							break;
						}
						// 몬스터 공격 턴
						System.out.printf("%s의 공격입니다", monster_name);
						System.out.println();
						sum = monster_attack();
						System.out.printf("%s의 데미지는 %d입니다.", hero_name, sum);
						hero_attacked(sum);
						if (hero_hp <= 0) {// 히어로 패배 시
							hero_hp = 1;
							System.out.println();
							System.out.printf("%s가 부활합니다", hero_name);
							System.out.println();
							System.out.println("********************");
							break;
						}
						System.out.println();

					}
				}

				// 전투 끝난 후 상황 정보 창
				System.out.println();
				System.out.println("********************");
				info();
			} else if (a == 2) {// 포션 상점으로 이동 시
				System.out.println("포션 상점에 입장하였습니다.");
				System.out.println(
						"1. 힘 증강 포션 (30원) \n2. 방어력 증강 포션 (30원) \n3. 경험치 증강 포션 (100원) \n4. HP 증강 포션 (10원) \n5. MP 증강 포션 (10원) \n원하시는 물건을 입력하세요. :");
				int potionNum = sc.nextInt();
				int money; // 지불 금액
				switch (potionNum) {

				case 1:// 힘 포션
					money = 30;
					hero_money -= money;
					if (hero_money >= 0) {
						System.out.println("포션 상점에서 물건을 구매 시도 하는 중입니다.\n구입이 완료되었습니다.");
						System.out.printf("%d원 남았습니다", hero_money);
						System.out.println();
						hero_power += potionStore_show(potionNum);

					} else {
						System.out.println("돈이 부족합니다.");
						hero_money += money;
					}
					break;
				case 2:// 방어력 포션
					money = 30;
					hero_money -= money;
					if (hero_money >= 0) {
						System.out.println("포션 상점에서 물건을 구매 시도 하는 중입니다.\n구입이 완료되었습니다.");
						System.out.printf("%d원 남았습니다", hero_money);
						System.out.println();
						hero_defense += potionStore_show(potionNum);
					} else {
						System.out.println("돈이 부족합니다.");
						hero_money += money;
					}
					break;
				case 3:// 경험치 포션
					money = 100;
					hero_money -= money;
					if (hero_money >= 0) {
						System.out.println("포션 상점에서 물건을 구매 시도 하는 중입니다.\n구입이 완료되었습니다.");
						System.out.printf("%d원 남았습니다", hero_money);
						System.out.println();
						hero_experience += potionStore_show(potionNum);
						// 이때 경험치 포션으로 인한 경험치 증가시 레벨업 조건 달성시 레벨업
						levelUp();
					} else {
						System.out.println("돈이 부족합니다.");
						hero_money += money;
					}
					break;
				case 4:// 체력 포션
					money = 10;
					hero_money -= money;
					if (hero_money >= 0) {
						System.out.println("포션 상점에서 물건을 구매 시도 하는 중입니다.\n구입이 완료되었습니다.");
						System.out.printf("%d원 남았습니다", hero_money);
						System.out.println();
						hero_hp += potionStore_show(potionNum);
					} else {
						System.out.println("돈이 부족합니다.");
						hero_money += money;
					}
					break;
				case 5:// 마나 포션
					money = 10;
					hero_money -= money;
					if (hero_money >= 0) {
						System.out.println("포션 상점에서 물건을 구매 시도 하는 중입니다.\n구입이 완료되었습니다.");
						System.out.printf("%d원 남았습니다", hero_money);
						System.out.println();
						hero_mp += potionStore_show(potionNum);
					} else {
						System.out.println("돈이 부족합니다.");
						hero_money += money;
					}
					break;
				default:
					System.out.println("다시 선택해 주세요.");
					break;

				}
				System.out.println();
				System.out.println("********************");
				info();

			}

		}

	}

}
