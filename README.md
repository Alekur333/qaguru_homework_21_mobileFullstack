<h1>Проект автоматизации тесткейсов на платформе Android для приложения Wikipedia.</h1>

Спроектирован прогон тестов на разных стендах:

<p  align="left">
<code>
<img width=50px height=50px title="BrowserStack remote" src="src/test/resources/media/bStack.png">
<img width="10%" height="30%" title="Selenide remote" src="src/test/resources/media/Selenide_icon.svg">
<img width="10%" height="30%" title="Android device" src="src/test/resources/media/androidDevice.jpg">
<img width="10%" height="30%" title="Android Virtual device" src="src/test/resources/media/avd.jpg">
</code>
</p>

<h4>При выполнении проекта проделана следующая работа:</h4>
<pre>
1.Установлен android studio https://developer.android.com/studio
2.Прописаны path на macOs:
Параметры Path:
Windows:
%ANDROID_HOME%\tools
%ANDROID_HOME%\tools\bin
%ANDROID_HOME%\platform-tools
Одной строкой, можно скопировать и добавить в конец Path: ;%ANDROID_HOME%\tools;%ANDROID_HOME%\tools\bin;%ANDROID_HOME%\platform-tools
Mac:
$ANDROID_HOME/tools
$ANDROID_HOME/tools/bin
$ANDROID_HOME/platform-tools
Одной строкой, можно скопировать и добавить в .bash_profile:
export PATH=”${PATH}:/$ANDROID_HOME/tools:/$ANDROID_HOME/tools/bin:/$ANDROID_HOME/platform-tools”
3.Установлен appium desktop https://github.com/appium/appium-desktop
4.В android studio -> SDK Manager смонтирован 11 андроид
5.В AVD Manager смонтирован образ Pixel 4 для 11 андроида
6.Использован эмулятор телефона
7.Использован Appium Desktop, по Appium server установлена связь с эмулятором
8.С помощью appium desktop инспектор определены локаторы для тесткейсов
9.Разработатны автотесты на getting started в приложении  - проход по 4м экранам, на каждом сделаны проверки
10.Настроена возможность запуска на разных стендах по параметру из командной строки -DdeviceHost=browserstack / selenoid / emulation / real
Для каждого сделан драйвер и конфиг с owner
</pre>



<h4> Пример запуска тестов на эмуляторе Андроид локально</h4>
<h5> Тестовый прогон по тэгу local для настрoек драйвера эмулятора через переменную deviceHost. </h5>
Команда для запуска gradle clean local -DdeviceHost=emulation

<p  align="left">
<code>
<img width="80%" title="Allure video" src="src/test/resources/media/emulatorMobileAndroidTest.gif">
</code>
</p>