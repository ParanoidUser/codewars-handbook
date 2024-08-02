import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AllNinesTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      11, 9
      12, -1
      13, 76923
      15, -1
      23, 434782608695652173913
      3989, 2506893958385560290799699172724993732765104036099273000752068187515668087239909751817498119829531210829781900225620456254700426171972925545249435948859363248934570067686136876410127851591877663574830784657808974680371020305841062923038355477563299072449235397342692404111306091752318876911506643268989721734770619202807721233391827525695663073451992980696916520431185760842316370017548257708698922035597894209074956129355728252694911005264477312609676610679368262722486838806718475808473301579343193782902983203810478816746051642015542742541990473802958134870894961143143645023815492604662822762597142140887440461268488342943093507144647781398846828779142642266232138380546502882928052143394334419654048633742792679869641514163950864878415643018300325896214590122837803960892454249185259463524692905490097768864377036851341188267736274755577839057407871647029330659313111055402356480320882426673351717222361494108799197793933316620706944096264728002005515166708448232639759338179994986212083228879418400601654550012534469791927801453998495863624968663825520180496365003760340937578340436199548759087490599147656054148909501128102281273502130859864627726247179744296816244672850338430684382050639257959388317874153923289044873401855101529205314615191777387816495362246176986713462020556530458761594384557533216344948608673853096014038606166959137628478315367259964903484582602155928804211581850087741288543494610177989471045374780646778641263474555026322386563048383053396841313612434194033592379042366507896715968914514916019052394083730258210077713712709952369014790674354474805715718225119077463023314113812985710704437202306342441714715467535723238906994234143895713211331160691902732514414640260716971672098270243168713963399348207570819754324392078215091501629481072950614189019804462271245926297317623464527450488844321885184256705941338681373777889195287039358235146653296565555277011782401604412133366758586111807470543995988969666583103534720481323640010027575833542241163198796690899974931060416144397092003008272750062672348959639007269992479318124843319127600902481825018801704687891702180997743795437452995738280270744547505640511406367510654299323138631235898721484081223364251692153421910253196289796941589370769616445224367009275507646026573075958886939082476811230884933567310102782652293807971922787666081724743043369265480070193030834795688142391576836299824517422913010779644021057909250438706442717473050889947355226873903233893206317372775131611932815241915266984206568062170970167961895211832539483579844572574580095261970418651291050388568563549761845073953371772374028578591125595387315116570569064928553522186011531712208573577337678616194534971170719478566056655803459513662572073201303584858360491351215843569816996741037854098771621960391075457508147405364753070945099022311356229631486588117322637252444221609425921283529706693406868889445976435196791175733266482827776385058912008022060666833792930559037352719979944848332915517673602406618200050137879167711205815993983454499874655302080721985460015041363750313361744798195036349962396590624216595638004512409125094008523439458510904988718977187264978691401353722737528202557031837553271496615693156179493607420406116821258460767109551265981448984707946853848082226121835046377538230132865379794434695412384056154424667836550513913261469039859613938330408623715216846327400350965154173978440711957884181499122587114565053898220105289546252193532213587365254449736776134369516169466031586863875658059664076209576334921032840310854850839809476059162697417899222862872900476309852093256455251942842817748809225369766858861870142892955627976936575582852845324642767610930057658561042867886688393080972674855853597392830283279017297568312860366006517924291802456756079217849084983705189270493858109801955377287540737026823765354725495111556781148157432940586613186262221108047129606417648533467034344447229882175983955878666332414138881925294560040110303334168964652795186763599899724241664577588368012033091
      """)
  void sample(BigInteger x, BigInteger m) {
    assertEquals(m, AllNines.allNines(x));
  }
}