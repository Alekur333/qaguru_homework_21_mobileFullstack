21. Мобильная автоматизация #2. Разрабатываем автотесты с эмулятором Android-устройства и на своем телефоне

Задание

1. Установить android studio https://developer.android.com/studio

2. Прописать path:
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

3. Установить appium desktop https://github.com/appium/appium-desktop

4. В android studio -> SDK Manager скачать 11 андроид (если не скачан по умолчанию)

5. В AVD Manager скачать образ Pixel 4 для 11 андроида (если не скачан по умолчанию)

6. Запустить эмулятор телефона, опробовать кнопки и функционал

7. Открыть Appium Desktop, запустить server, проконектиться к эмулятору

8. Открыть в appium desktop инспектор, изучить его функционал, попробовать найти локатор

9. Разработать автотест на getting started в приложении википедии - пройти по 4м экранам, на каждом сделать проверку

10. Доработать возможность запуска на разных стендах (передать из командной строки -DdeviceHost=browserstack / selenoid / emulation / real

Для каждого сделать драйвер и конфиг с owner




## Пример запуска тестов на эмуляторе Андроид локально
### Тестовый прогон по тэгу local для настрoек драйвера эмулятора через переменную deviceHost. 
Команда для запуска gradle clean local -DdeviceHost=emulation

<p  align="left">
<code>
<img width="80%" title="Allure video" src="src/test/resources/media/emulatorMobileAndroidTest.gif">
</code>
</p>