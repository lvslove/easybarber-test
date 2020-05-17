package com.dreamteam.easybarber.service;

import com.dreamteam.easybarber.domain.BaseServices;
import com.dreamteam.easybarber.repos.BaseServicesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DefaultServicesService
{
    public static final String[] mainPageServices =
            {
                    "Мужская стрижка",
                    "Стрижка машинкой",
                    "Детская стрижка",
                    "Фейд",
                    "Опасное бритье комплекс",
                    "Стрижка бороды",
                    "Борода + усы",
                    "Камуфляж",
                    "SPA",
                    "Black mask",
                    "Укладка" ,
                    "Массаж головы"
            };
    public static String[] serviceShortcut=
            {
                    "haircut",
                    "clipper",
                    "children",
                    "fade",
                    "shaving",
                    "beard",
                    "musache",
                    "сamouflage",
                    "spa",
                    "mask",
                    "styling",
                    "massage"
            };
    public static final String[] correspondingIds =
            {
                    "haircut_ref",
                    "clipper_ref",
                    "for_children_ref",
                    "fade_ref",
                    "shaving_ref",
                    "beard1_ref",
                    "beard2_ref",
                    "grey_haired_ref",
                    "spa_ref",
                    "mask_ref",
            };
    public static final String[] citys=
            {
                  "Москва",
                  "Санкт-Петербург",
                  "Новосибирск",
                  "Екатеринбург",
                  "Нижний Новгород",
                  "Казань",
                  "Челябинск",
                  "Омск",
                  "Самара",
                  "Ростов-на-Дону",
                  "Уфа",
                  "Красноярск",
                  "Воронеж",
                  "Пермь",
                  "Волгоград",
                  "Краснодар",
                  "Саратов",
                  "Тюмень",
                  "Тольятти",
                  "Ижевск",
                  "Барнаул",
                  "Ульяновск",
                  "Иркутск",
                  "Хабаровск",
                  "Ярославль",
                  "Владивосток",
                  "Махачкала",
                  "Томск",
                  "Оренбург",
                  "Кемерово",
                  "Новокузнецк",
                  "Рязань",
                  "Астра",
                  "Набережные Челны",
                  "Пенза",
                  "Киров",
                  "Липецк",
                  "Чебоксары",
                  "Балашиха",
                  "Калининград",
                  "Тула",
                  "Курск",
                  "Севастополь",
                  "Сочи",
                  "Ставрополь",
                  "Улан-Удэ",
                  "Тверь",
                  "Магнитогорск",
                  "Иваново",
                  "Брянск",
                  "Белгород",
                  "Сургут",
                  "Владимир",
                  "Нижний Тагил",
                  "Чита",
                  "Архангельск",
                  "Симферополь",
                  "Калуга",
                  "Смоленск",
                  "Волжский",
                  "Якутск",
                  "Саранск",
                  "Череповец",
                  "Курган",
                  "Вологда",
                  "Орёл",
                  "Владикавказ",
                  "Подольск",
                  "Грозный",
                  "Мурманск",
                  "Тамбов",
                  "Петрозаводск",
                  "Стерлитамак",
                  "Нижневартовск",
                  "Кострома",
                  "Новороссийск",
                  "Йошкар-Ола",
                  "Химки",
                  "Таганрог",
                  "Комсомольск-на-Амуре",
                  "Сыктывкар",
                  "Нижнекамск",
                  "Нальчик",
                  "Шахты",
                  "Дзержинск",
                  "Орск",
                  "Братск",
                  "Благовещенск",
                  "Энгельс",
                  "Ангарск",
                  "Королёв",
                  "Великий Новгород",
                  "Старый Оскол",
                  "Мытищи",
                  "Псков",
                  "Люберцы",
                  "Южно-Сахалинск",
                  "Бийск",
                  "Прокопьевск",
                  "Армавир",
                  "Балаково",
                  "Рыбинск",
                  "Абакан",
                  "Северодвинск",
                  "Петропавловск-Камчатский",
                  "Норильск",
                  "Уссурийск",
                  "Волгодонск",
                  "Красногорск",
                  "Сызрань",
                  "Новочеркасск",
                  "Каменск - Уральский",
                  "Златоуст",
                  "Электросталь",
                  "Альметьевск",
                  "Салават",
                  "Миасс",
                  "Керчь",
                  "Копейск",
                  "Находка",
                  "Пятигорск",
                  "Хасавюрт",
                  "Рубцовск",
                  "Березники",
                  "Коломна",
                  "Майкоп",
                  "Одинцово",
                  "Ковров",
                  "Домодедово",
                  "Нефтекамск",
                  "Кисловодск",
                  "Нефтеюганск",
                  "Батайск",
                  "Новочебоксарск",
                  "Серпухов",
                  "Щёлково",
                  "Дербент",
                  "Новомосковск",
                  "Черкесск",
                  "Первоуральск",
                  "Раменское",
                  "Назрань",
                  "Каспийск",
                  "Обнинск",
                  "Орехово-Зуево",
                  "Кызыл",
                  "Новый Уренгой",
                  "Невинномысск",
                  "Димитровград",
                  "Октябрьский",
                  "Долгопрудный",
                  "Ессентуки",
                  "Камышин",
                  "Муром",
                  "Жуковский",
                  "Евпатория",
                  "Новошахтинск",
                  "Северск",
                  "Реутов",
                  "Пушкино",
                  "Артем",
                  "Ноябрьск",
                  "Ачинск",
                  "Бердск",
                  "Арзамас",
                  "Елец",
                  "Элиста",
                  "Ногинск",
                  "Сергиев Посад",
                  "Новокуйбышевск",
                  "Железногорск"
            };

    @Autowired
    BaseServicesRepo baseServicesRepo;

    @PostConstruct
    public void init()
    {
        for(String sname : mainPageServices)
        {
            if(baseServicesRepo.findByName(sname) == null)
            {
                BaseServices s = new BaseServices(sname);
                baseServicesRepo.save(s);
            }
        }
    }
}