import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SampleTest {

  private final List<List<Character>> charmap = List.of(
      List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
          'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'),
      List.of('c', 'l', 'm', 'e', 'y', 'n', 'v', 'k', 'p', 'g', 'w', 'f', 'h', 's', 'd', 'b', 'u',
          'j', 'x', 'i', 'a', 'r', 'o', 't', 'q', 'z'),
      List.of('j', 'd', 'n', 'z', 'p', 'b', 'g', 'u', 'a', 'l', 'e', 'f', 'o', 'k', 'w', 's', 'r',
          'q', 'v', 'm', 'y', 'h', 'x', 't', 'i', 'c'),
      List.of('e', 'k', 'l', 'h', 'a', 'f', 'w', 'm', 'b', 'r', 'y', 'g', 'p', 'i', 't', 'n', 's',
          'q', 'd', 'o', 'u', 'j', 'c', 'v', 'z', 'x'),
      List.of('t', 'p', 'c', 'n', 'm', 'w', 'e', 'j', 'f', 'v', 'd', 'r', 's', 'l', 'y', 'u', 'h',
          'x', 'b', 'g', 'o', 'z', 'a', 'k', 'i', 'q'),
      List.of('f', 'm', 'e', 'k', 'c', 'p', 'z', 'w', 'h', 'a', 'i', 'd', 'x', 'q', 'u', 'l', 's',
          'y', 'o', 'b', 't', 'r', 'j', 'g', 'v', 'n')
  );

  @Test
  void firstText() {
    var cipher = """
        Ndaj xmdjy cse xyrys qycjx cvd daj ncikyjx ljdavki ndjik ds ikpx mdsipsysi, c syo scipds, mdsmyprye
        ps fplyjiq, cse eyepmciye id iky bjdbdxpipds ikci cff hys cjy mjyciye yuacf.
                
        Sdo oy cjy ysvcvye ps c vjyci mprpf ocj, iyxipsv okyikyj ikci scipds, dj csq scipds xd mdsmyprye cse
        xd eyepmciye, mcs fdsv yseajy. Oy cjy hyi ds c vjyci lciifynpyfe dn ikci ocj. Oy kcry mdhy id
        eyepmciy c bdjipds dn ikci npyfe, cx c npscf jyxipsv bfcmy ndj ikdxy okd kyjy vcry ikypj fpryx ikci
        ikci scipds hpvki fpry. Pi px cfidvyikyj npiipsv cse bjdbyj ikci oy xkdafe ed ikpx.
                
        Lai ps c fcjvyj xysxy, oy mcssdi eyepmciy – oy mcssdi mdsxymjciy – oy mcssdi kcffdo – ikpx vjdase.
        Iky ljcry hys, fprpsv cse eyce, okd xijavvfye kyjy, kcry mdsxymjciye pi, ncj cldry daj bddj bdoyj id
        cee dj eyijcmi. Iky odjfe opff fpiify sdiy, sdj fdsv jyhyhlyj, okci oy xcq kyjy, lai pi mcs syryj
        ndjvyi okci ikyq epe kyjy. Pi px ndj ax iky fprpsv, jcikyj, id ly eyepmciye kyjy id iky asnpspxkye
        odjw okpmk ikyq okd ndavki kyjy kcry ikax ncj xd sdlfq cercsmye. Pi px jcikyj ndj ax id ly kyjy
        eyepmciye id iky vjyci icxw jyhcpspsv lyndjy ax – ikci njdh ikyxy kdsdjye eyce oy icwy psmjycxye
        eyrdipds id ikci mcaxy ndj okpmk ikyq vcry iky fcxi naff hycxajy dn eyrdipds – ikci oy kyjy kpvkfq
        jyxdfry ikci ikyxy eyce xkcff sdi kcry epye ps rcps – ikci ikpx scipds, aseyj Vde, xkcff kcry c syo
        lpjik dn njyyedh – cse ikci vdryjshysi dn iky bydbfy, lq iky bydbfy, ndj iky bydbfy, xkcff sdi
        byjpxk njdh iky ycjik.
        """;
    var plain = decrypt(cipher, 1);
    assertEquals("Lincoln", Dinglemouse.who(1, cipher));
    assertEquals(cipher.length(), plain.length());
  }

  @Test
  void secondText() {
    var cipher = """
        Sqpvazpkm Samcpq, Oq. Hanp Sqpvazpkm, Gwhpqkwq, Nwkgqpvvojk Muwojv, Vpkjmwq Xafpi, jkz Nwkgqpvvojk
        Oaffpq, Oq. Xpdd, Oq. Dpff, vnapkmavmv, zavmakgyavupz gypvmv, jkz fjzapv jkz gpkmfpopk:
            
        A jssqpnajmp iwyq sqpvazpkm ujhakg ojzp op jk uwkwqjqi havamakg sqwbpvvwq, jkz A xaff jvvyqp iwy
        mujm oi baqvm fpnmyqp xaff dp hpqi dqapb.
            
        A jo zpfagumpz mw dp upqp jkz A’o sjqmanyfjqfi zpfagumpz mw dp upqp wk muav wnnjvawk.
            
        Xp oppm jm j nwffpgp kwmpz bwq ekwxfpzgp, ak j nami kwmpz bwq sqwgqpvv, ak j vmjmp kwmpz bwq
        vmqpkgmu, jkz xp vmjkz ak kppz wb jff muqpp, bwq xp oppm ak jk uwyq wb nujkgp jkz nujffpkgp, ak j
        zpnjzp wb uwsp jkz bpjq, ak jk jgp wb dwmu ekwxfpzgp jkz agkwqjknp. Mup gqpjmpq wyq ekwxfpzgp
        aknqpjvpv, mup gqpjmpq wyq agkwqjknp ykbwfzv.
            
        Zpvsamp mup vmqaeakg bjnm mujm owvm wb mup vnapkmavmv mujm mup xwqfz ujv phpq ekwxk jqp jfahp jkz
        xwqeakg mwzji, zpvsamp mup bjnm mujm muav Kjmawk’v wxk vnapkmaban ojkswxpq av zwydfakg phpqi 99
        ipjqv ak j qjmp wb gqwxmu owqp mujk muqpp maopv mujm wb wyq swsyfjmawk jv j xuwfp, zpvsamp mujm, mup
        hjvm vmqpmnupv wb mup ykekwxk jkz mup ykjkvxpqpz jkz mup ykbakavupz vmaff bjq wymvmqas wyq
        nwffpnmahp nwosqpupkvawk.
            
        Kw ojk njk byffi gqjvs uwx bjq jkz uwx bjvm xp ujhp nwop, dym nwkzpkvp, ab iwy xaff, mup 99,999
        ipjqv wb ojk’v qpnwqzpz uavmwqi ak j maop vsjk wb dym j ujfb-npkmyqi. Vmjmpz ak mupvp mpqov, xp ekwx
        hpqi fammfp jdwym mup baqvm 99 ipjqv, ptnpsm jm mup pkz wb mupo jzhjknpz ojk ujz fpjqkpz mw yvp mup
        veakv wb jkaojfv mw nwhpq mupo. Mupk jdwym 99 ipjqv jgw, ykzpq muav vmjkzjqz, ojk popqgpz bqwo uav
        njhpv mw nwkvmqynm wmupq eakzv wb vupfmpq. Wkfi bahp ipjqv jgw ojk fpjqkpz mw xqamp jkz yvp j njqm
        xamu xuppfv. Nuqavmajkami dpgjk fpvv mujk mxw ipjqv jgw. Mup sqakmakg sqpvv njop muav ipjq, jkz mupk
        fpvv mujk mxw owkmuv jgw, zyqakg muav xuwfp 99-ipjq vsjk wb uyojk uavmwqi, mup vmpjo pkgakp sqwhazpz
        j kpx vwyqnp wb swxpq. Kpxmwk ptsfwqpz mup opjkakg wb gqjhami. Fjvm owkmu pfpnmqan fagumv jkz
        mpfpsuwkpv jkz jymwowdafpv jkz jaqsfjkpv dpnjop jhjafjdfp. Wkfi fjvm xppe zaz xp zphpfws spkanaffak
        jkz mpfphavawk jkz kynfpjq swxpq, jkz kwx ab Jopqanj’v kpx vsjnpnqjbm vynnppzv ak qpjnuakg Hpkyv, xp
        xaff ujhp fampqjffi qpjnupz mup vmjqv dpbwqp oazkagum mwkagum.
            
        Muav av j dqpjmumjeakg sjnp, jkz vynu j sjnp njkkwm upfs dym nqpjmp kpx affv jv am zavspfv wfz, kpx
        agkwqjknp, kpx sqwdfpov, kpx zjkgpqv. Vyqpfi mup wspkakg havmjv wb vsjnp sqwoavp uagu nwvmv jkz
        ujqzvuasv, jv xpff jv uagu qpxjqz.
            
        Vw am av kwm vyqsqavakg mujm vwop xwyfz ujhp yv vmji xupqp xp jqp j fammfp fwkgpq mw qpvm, mw xjam.
        Dym muav nami wb Uwyvmwk, muav vmjmp wb Mptjv, muav nwykmqi wb mup Ykampz Vmjmpv xjv kwm dyafm di
        muwvp xuw xjampz jkz qpvmpz jkz xavupz mw fwwe dpuakz mupo. Muav nwykmqi xjv nwkrypqpz di muwvp xuw
        owhpz bwqxjqz–jkz vw xaff vsjnp.
            
        Xaffajo Dqjzbwqz, vspjeakg ak 9999 wb mup bwykzakg wb mup Sfiowymu Dji Nwfwki, vjaz mujm jff gqpjm
        jkz uwkwqjdfp jnmawkv jqp jnnwosjkapz xamu gqpjm zabbanyfmapv, jkz dwmu oyvm dp pkmpqsqavpz jkz
        whpqnwop xamu jkvxpqjdfp nwyqjgp.
            
        Ab muav njsvyfp uavmwqi wb wyq sqwgqpvv mpjnupv yv jkimuakg, am av mujm ojk, ak uav rypvm bwq
        ekwxfpzgp jkz sqwgqpvv, av zpmpqoakpz jkz njkkwm dp zpmpqqpz. Mup ptsfwqjmawk wb vsjnp xaff gw
        jupjz, xupmupq xp lwak ak am wq kwm, jkz am av wkp wb mup gqpjm jzhpkmyqpv wb jff maop, jkz kw
        kjmawk xuanu ptspnmv mw dp mup fpjzpq wb wmupq kjmawkv njk ptspnm mw vmji dpuakz ak muav qjnp bwq
        vsjnp.
            
        Muwvp xuw njop dpbwqp yv ojzp npqmjak mujm muav nwykmqi qwzp mup baqvm xjhpv wb mup akzyvmqajf
        qphwfymawk, mup baqvm xjhpv wb owzpqk akhpkmawk, jkz mup baqvm xjhp wb kynfpjq swxpq, jkz muav
        gpkpqjmawk zwpv kwm akmpkz mw bwykzpq ak mup djnexjvu wb mup nwoakg jgp wb vsjnp. Xp opjk mw dp j
        sjqm wb am–xp opjk mw fpjz am. Bwq mup pipv wb mup xwqfz kwx fwwe akmw vsjnp, mw mup owwk jkz mw mup
        sfjkpmv dpiwkz, jkz xp ujhp hwxpz mujm xp vujff kwm vpp am gwhpqkpz di j uwvmafp bfjg wb nwkrypvm,
        dym di j djkkpq wb bqppzwo jkz spjnp. Xp ujhp hwxpz mujm xp vujff kwm vpp vsjnp baffpz xamu xpjswkv
        wb ojvv zpvmqynmawk, dym xamu akvmqyopkmv wb ekwxfpzgp jkz ykzpqvmjkzakg.
            
        Ipm mup hwxv wb muav Kjmawk njk wkfi dp byfbaffpz ab xp ak muav Kjmawk jqp baqvm, jkz, mupqpbwqp, xp
        akmpkz mw dp baqvm. Ak vuwqm, wyq fpjzpqvuas ak vnapknp jkz akzyvmqi, wyq uwspv bwq spjnp jkz
        vpnyqami, wyq wdfagjmawkv mw wyqvpfhpv jv xpff jv wmupqv, jff qpryaqp yv mw ojep muav pbbwqm, mw
        vwfhp mupvp oivmpqapv, mw vwfhp mupo bwq mup gwwz wb jff opk, jkz mw dpnwop mup xwqfz’v fpjzakg
        vsjnp-bjqakg kjmawk.
            
        Xp vpm vjaf wk muav kpx vpj dpnjyvp mupqp av kpx ekwxfpzgp mw dp gjakpz, jkz kpx qagumv mw dp xwk,
        jkz mupi oyvm dp xwk jkz yvpz bwq mup sqwgqpvv wb jff spwsfp. Bwq vsjnp vnapknp, faep kynfpjq
        vnapknp jkz jff mpnukwfwgi, ujv kw nwkvnapknp wb amv wxk. Xupmupq am xaff dpnwop j bwqnp bwq gwwz wq
        aff zpspkzv wk ojk, jkz wkfi ab mup Ykampz Vmjmpv wnnysapv j swvamawk wb sqp-poakpknp njk xp upfs
        zpnazp xupmupq muav kpx wnpjk xaff dp j vpj wb spjnp wq j kpx mpqqabiakg mupjmpq wb xjq. A zw kwm
        vji mujm xp vuwyfz wq xaff gw yksqwmpnmpz jgjakvm mup uwvmafp oavyvp wb vsjnp jki owqp mujk xp gw
        yksqwmpnmpz jgjakvm mup uwvmafp yvp wb fjkz wq vpj, dym A zw vji mujm vsjnp njk dp ptsfwqpz jkz
        ojvmpqpz xamuwym bppzakg mup baqpv wb xjq, xamuwym qpspjmakg mup oavmjepv mujm ojk ujv ojzp ak
        ptmpkzakg uav xqam jqwykz muav gfwdp wb wyqv.
            
        Mupqp av kw vmqabp, kw sqplyzanp, kw kjmawkjf nwkbfanm ak wympq vsjnp jv ipm. Amv ujcjqzv jqp
        uwvmafp mw yv jff. Amv nwkrypvm zpvpqhpv mup dpvm wb jff ojkeakz, jkz amv wsswqmykami bwq spjnpbyf
        nwwspqjmawk ojki kphpq nwop jgjak. Dym xui, vwop vji, mup owwk? Xui nuwwvp muav jv wyq gwjf? Jkz
        mupi oji xpff jve xui nfaod mup uagupvm owykmjak? Xui, 99 ipjqv jgw, bfi mup Jmfjkman? Xui zwpv Qanp
        sfji Mptjv?
            
        Xp nuwwvp mw gw mw mup owwk. Xp nuwwvp mw gw mw mup owwk ak muav zpnjzp jkz zw mup wmupq muakgv, kwm
        dpnjyvp mupi jqp pjvi, dym dpnjyvp mupi jqp ujqz, dpnjyvp mujm gwjf xaff vpqhp mw wqgjkacp jkz
        opjvyqp mup dpvm wb wyq pkpqgapv jkz veaffv, dpnjyvp mujm nujffpkgp av wkp mujm xp jqp xaffakg mw
        jnnpsm, wkp xp jqp ykxaffakg mw swvmswkp, jkz wkp xuanu xp akmpkz mw xak, jkz mup wmupqv, mww.
            
        Am av bwq mupvp qpjvwkv mujm A qpgjqz mup zpnavawk fjvm ipjq mw vuabm wyq pbbwqmv ak vsjnp bqwo fwx
        mw uagu gpjq jv jowkg mup owvm aoswqmjkm zpnavawkv mujm xaff dp ojzp zyqakg oi aknyodpkni ak mup
        wbbanp wb mup Sqpvazpkni.
            
        Ak mup fjvm 99 uwyqv xp ujhp vppk bjnafamapv kwx dpakg nqpjmpz bwq mup gqpjmpvm jkz owvm nwosfpt
        ptsfwqjmawk ak ojk’v uavmwqi. Xp ujhp bpfm mup gqwykz vujep jkz mup jaq vujmmpqpz di mup mpvmakg wb
        j Vjmyqk N-9 dwwvmpq qwnepm, ojki maopv jv swxpqbyf jv mup Jmfjv xuanu fjyknupz Lwuk Gfpkk,
        gpkpqjmakg swxpq pryahjfpkm mw 99,999 jymwowdafpv xamu mupaq jnnpfpqjmwqv wk mup bfwwq. Xp ujhp vppk
        mup vamp xupqp bahp B-9 qwnepm pkgakpv, pjnu wkp jv swxpqbyf jv jff pagum pkgakpv wb mup Vjmyqk
        nwodakpz, xaff dp nfyvmpqpz mwgpmupq mw ojep mup jzhjknpz Vjmyqk oavvafp, jvvpodfpz ak j kpx
        dyafzakg mw dp dyafm jm Njsp Njkjhpqjf jv mjff jv j 99 vmwqi vmqynmyqp, jv xazp jv j nami dfwne, jkz
        jv fwkg jv mxw fpkgmuv wb muav bapfz.
            
        Xamuak mupvp fjvm 99 owkmuv jm fpjvm 99 vjmpffampv ujhp naqnfpz mup pjqmu. Vwop 99 wb mupo xpqp ojzp
        ak mup Ykampz Vmjmpv wb Jopqanj jkz mupi xpqp bjq owqp vwsuavmanjmpz jkz vyssfapz bjq owqp ekwxfpzgp
        mw mup spwsfp wb mup xwqfz mujk muwvp wb mup Vwhapm Ykawk.
            
        Mup Ojqakpq vsjnpnqjbm kwx wk amv xji mw Hpkyv av mup owvm akmqanjmp akvmqyopkm ak mup uavmwqi wb
        vsjnp vnapknp. Mup jnnyqjni wb mujm vuwm av nwosjqjdfp mw baqakg j oavvafp bqwo Njsp Njkjhpqjf jkz
        zqwssakg am ak muav vmjzayo dpmxppk mup 99-ijqz fakpv.
            
        Mqjkvam vjmpffampv jqp upfsakg wyq vuasv jm vpj mw vmppq j vjbpq nwyqvp. Maqwv vjmpffampv ujhp gahpk
        yv yksqpnpzpkmpz xjqkakgv wb uyqqanjkpv jkz vmwqov, jkz xaff zw mup vjop bwq bwqpvm baqpv jkz
        anpdpqgv.
            
        Xp ujhp ujz wyq bjafyqpv, dym vw ujhp wmupqv, phpk ab mupi zw kwm jzoam mupo. Jkz mupi oji dp fpvv
        sydfan.
            
        Mw dp vyqp, xp jqp dpuakz, jkz xaff dp dpuakz bwq vwop maop ak ojkkpz bfagum. Dym xp zw kwm akmpkz
        mw vmji dpuakz, jkz ak muav zpnjzp, xp vujff ojep ys jkz owhp jupjz.
            
        Mup gqwxmu wb wyq vnapknp jkz pzynjmawk xaff dp pkqanupz di kpx ekwxfpzgp wb wyq ykahpqvp jkz
        pkhaqwkopkm, di kpx mpnukarypv wb fpjqkakg jkz ojssakg jkz wdvpqhjmawk, di kpx mwwfv jkz nwosympqv
        bwq akzyvmqi, opzanakp, mup uwop jv xpff jv mup vnuwwf. Mpnukanjf akvmamymawkv, vynu jv Qanp, xaff
        qpjs mup ujqhpvm wb mupvp gjakv.
            
        Jkz bakjffi, mup vsjnp pbbwqm amvpfb, xuafp vmaff ak amv akbjkni, ujv jfqpjzi nqpjmpz j gqpjm kyodpq
        wb kpx nwosjkapv, jkz mpkv wb muwyvjkzv wb kpx lwdv. Vsjnp jkz qpfjmpz akzyvmqapv jqp gpkpqjmakg kpx
        zpojkzv ak akhpvmopkm jkz veaffpz spqvwkkpf, jkz muav nami jkz muav vmjmp, jkz muav qpgawk, xaff
        vujqp gqpjmfi ak muav gqwxmu. Xujm xjv wknp mup byqmupvm wymswvm wk mup wfz bqwkmapq wb mup Xpvm
        xaff dp mup byqmupvm wymswvm wk mup kpx bqwkmapq wb vnapknp jkz vsjnp. Uwyvmwk, iwyq nami wb
        Uwyvmwk, xamu amv Ojkkpz Vsjnpnqjbm Npkmpq, xaff dpnwop mup upjqm wb j fjqgp vnapkmaban jkz
        pkgakppqakg nwooykami. Zyqakg mup kptm 9 ipjqv mup Kjmawkjf Jpqwkjymanv jkz Vsjnp Jzoakavmqjmawk
        ptspnmv mw zwydfp mup kyodpq wb vnapkmavmv jkz pkgakppqv ak muav jqpj, mw aknqpjvp amv wymfjiv bwq
        vjfjqapv jkz ptspkvpv mw $99 oaffawk j ipjq; mw akhpvm vwop $999 oaffawk ak sfjkm jkz fjdwqjmwqi
        bjnafamapv; jkz mw zaqpnm wq nwkmqjnm bwq kpx vsjnp pbbwqmv whpq $9 daffawk bqwo muav npkmpq ak muav
        nami.
            
        Mw dp vyqp, jff muav nwvmv yv jff j gwwz zpjf wb owkpi. Muav ipjq’v vsjnp dyzgpm av muqpp maopv xujm
        am xjv ak Ljkyjqi 9999, jkz am av gqpjmpq mujk mup vsjnp dyzgpm wb mup sqphawyv pagum ipjqv
        nwodakpz. Mujm dyzgpm kwx vmjkzv jm $9,999 oaffawk j ipjq–j vmjggpqakg vyo, muwygu vwopxujm fpvv
        mujk xp sji bwq nagjqpmmpv jkz nagjqv phpqi ipjq. Vsjnp ptspkzamyqpv xaff vwwk qavp vwop owqp, bqwo
        99 npkmv spq spqvwk spq xppe mw owqp mujk 99 npkmv j xppe bwq phpqi ojk, xwojk jkz nuafz ak mup
        Ykampz Vmjmpv, bwq xp ujhp gahpk muav sqwgqjo j uagu kjmawkjf sqawqami–phpk muwygu A qpjfacp mujm
        muav av ak vwop opjvyqp jk jnm wb bjamu jkz havawk, bwq xp zw kwm kwx ekwx xujm dpkpbamv jxjam yv.
        Dym ab A xpqp mw vji, oi bpffwx namacpkv, mujm xp vujff vpkz mw mup owwk, 999,999 oafpv jxji bqwo
        mup nwkmqwf vmjmawk ak Uwyvmwk, j gajkm qwnepm owqp mujk 999 bppm mjff, mup fpkgmu wb muav bwwmdjff
        bapfz, ojzp wb kpx opmjf jffwiv, vwop wb xuanu ujhp kwm ipm dppk akhpkmpz, njsjdfp wb vmjkzakg upjm
        jkz vmqpvvpv vphpqjf maopv owqp mujk ujhp phpq dppk ptspqapknpz, bammpz mwgpmupq xamu j sqpnavawk
        dpmmpq mujk mup bakpvm xjmnu, njqqiakg jff mup pryasopkm kppzpz bwq sqwsyfvawk, gyazjknp, nwkmqwf,
        nwooykanjmawkv, bwwz jkz vyqhahjf, wk jk ykmqapz oavvawk, mw jk ykekwxk npfpvmajf dwzi, jkz mupk
        qpmyqk am vjbpfi mw pjqmu, qp-pkmpqakg mup jmowvsupqp jm vsppzv wb whpq 99,999 oafpv spq uwyq,
        njyvakg upjm jdwym ujfb mujm wb mup mpospqjmyqp wb mup vyk–jfowvm jv uwm jv am av upqp mwzji–jkz zw
        jff muav, jkz zw am qagum, jkz zw am baqvm dpbwqp muav zpnjzp av wym–mupk xp oyvm dp dwfz.
            
        A’o mup wkp xuw av zwakg jff mup xwqe, vw xp lyvm xjkm iwy mw vmji nwwf bwq j oakymp.
            
        Uwxphpq, A muake xp’qp gwakg mw zw am, jkz A muake mujm xp oyvm sji xujm kppzv mw dp sjaz. A zwk’m
        muake xp wygum mw xjvmp jki owkpi, dym A muake xp wygum mw zw mup lwd. Jkz muav xaff dp zwkp ak mup
        zpnjzp wb mup Vatmapv. Am oji dp zwkp xuafp vwop wb iwy jqp vmaff upqp jm vnuwwf jm muav nwffpgp jkz
        ykahpqvami. Am xaff dp zwkp zyqakg mup mpqov wb wbbanp wb vwop wb mup spwsfp xuw vam upqp wk muav
        sfjmbwqo. Dym am xaff dp zwkp. Jkz am xaff dp zwkp dpbwqp mup pkz wb muav zpnjzp.
            
        Jkz A jo zpfagumpz mujm muav ykahpqvami av sfjiakg j sjqm ak symmakg j ojk wk mup owwk jv sjqm wb j
        gqpjm kjmawkjf pbbwqm wb mup Ykampz Vmjmpv wb Jopqanj.
            
        Ojki ipjqv jgw mup gqpjm Dqamavu ptsfwqpq Gpwqgp Ojffwqi, xuw xjv mw zap wk Owykm Phpqpvm, xjv jvepz
        xui zaz up xjkm mw nfaod am. Up vjaz, “Dpnjyvp am av mupqp.”
            
        Xpff, vsjnp av mupqp, jkz xp’qp gwakg mw nfaod am, jkz mup owwk jkz mup sfjkpmv jqp mupqp, jkz kpx
        uwspv bwq ekwxfpzgp jkz spjnp jqp mupqp. Jkz, mupqpbwqp, jv xp vpm vjaf xp jve Gwz’v dfpvvakg wk mup
        owvm ujcjqzwyv jkz zjkgpqwyv jkz gqpjmpvm jzhpkmyqp wk xuanu ojk ujv phpq podjqepz.
            
        Mujke iwy.
        """;
    var plain = decrypt(cipher, 2);
    assertEquals("Kennedy", Dinglemouse.who(2, cipher));
    assertEquals(cipher.length(), plain.length());
  }

  @Test
  void thirdText() {
    var cipher = """
        Fqtp oma ptpaio omeo oma Fqailm hafaidad eo Dahei eih ti oma Pauda caqa kqtyai eo oma aih tf oma
        daltih caay tf Pez, tigz e qenbh qaoqaeo ot Epbaid eih oma dtuom ltugh meja dejah oma Kqbobdm eih
        Fqailm Eqpbad cmt meh aioaqah Kagwbup eo oma ennaeg tf oma Kagwbei Ybiw; kuo ombd doqeoawbl felo ced
        ito bppahbeoagz qaegbxah. Oma Fqailm Mbwm Ltppeih mtnah omaz ctugh ka ekga ot lgtda oma wen, eih oma
        Eqpbad tf oma itqom caqa uihaq omabq tqhaqd. Ptqatjaq, e qaobqapaio tf ombd ybih ctugh meja bijtgjah
        egptdo laqoebigz oma hadoqulobti tf oma fbia Kagwbei Eqpz tf tjaq 99 hbjbdbtid eih oma ekeihtipaio
        tf oma cmtga tf Kagwbup. Omaqaftqa, cmai oma ftqla eih dltna tf oma Waqpei naiaoqeobti caqa qaegbxah
        eih cmai e iac Fqailm Waiaqegbddbpt, Waiaqeg Cazweih, eddupah ltppeih bi ngela tf Waiaqeg Wepagbi,
        ei afftqo ced peha kz oma Fqailm eih Kqbobdm Eqpbad bi Kagwbup ot yaan ti mtghbiw oma qbwmo meih tf
        oma Kagwbeid eih ot wbja omabq tci qbwmo meih ot e iacgz lqaeoah Fqailm Eqpz cmblm ced ot meja
        ehjeilah elqtdd oma Dtppa bi wqaeo doqaiwom ot wqedn bo.
            
        Mtcajaq, oma Waqpei aqunobti dcano gbya e dmeqn dlzoma eqtuih oma qbwmo eih qaeq tf oma Eqpbad tf
        oma itqom. Abwmo tq ibia eqptqah hbjbdbtid, aelm tf ektuo ftuq muihqah eqptqah jamblgad tf hbffaqaio
        ybihd, kuo leqafuggz eddtqoah ot ka ltpngapaioeqz eih hbjbdbkga biot dpegg dagf-ltioebiah uibod, luo
        tff egg ltppuibleobtid kaocaai ud eih oma pebi Fqailm Eqpbad. Bo dajaqah tuq tci ltppuibleobtid ftq
        ftth eih eppuibobti, cmblm qei fbqdo ot Epbaid eih efoaqceqhd omqtuwm Ekkajbgga, eih bo dmtqa bod
        cez un oma ltedo ot Ktugtwia eih Legebd, eih egptdo ot Huiybqy. Kambih ombd eqptqah eih palmeibxah
        tidgeuwmo lepa e iupkaq tf Waqpei hbjbdbtid bi gtqqbad, eih kambih omap ewebi omaqa ngthhah
        ltpneqeobjagz dgtcgz oma hugg kquoa pedd tf oma tqhbieqz Waqpei Eqpz eih Waqpei natnga, egcezd dt
        qaehz ot ka gah ot oma oqepngbiw htci bi tomaq geihd tf gbkaqobad eih ltpftqod cmblm omaz meja iajaq
        yitci bi omabq tci.
            
        B meja debh ombd eqptqah dlzoma-doqtya egptdo qaelmah Huiybqy-egptdo kuo ito suboa. Ktugtwia eih
        Legebd caqa oma dlaiad tf hadnaqeoa fbwmobiw. Oma Wueqhd hafaihah Ktugtwia ftq e cmbga eih caqa omai
        cbomhqeci kz tqhaqd fqtp ombd ltuioqz. Oma Qbfga Kqbweha, oma 99om Qbfgad, eih oma Suaai Jblotqbe’d
        Qbfgad, cbom e keooegbti tf Kqbobdm oeiyd eih 9,999 Fqailmpai, bi egg ektuo ftuq omtudeih doqtiw,
        hafaihah Legebd ot oma gedo. Oma Kqbobdm Kqbwehbaq ced wbjai ei mtuq ot duqqaihaq. Ma dnuqiah oma
        tffaq, eih ftuq hezd tf bioaida doqaao fbwmobiw neddah kaftqa dbgaila qabwiah tjaq Legebd, cmblm
        peqyah oma aih tf e paptqekga qadbdoeila. Tigz 99 uictuihah duqjbjtqd caqa kqtuwmo tff kz oma Iejz,
        eih ca ht ito yitc oma feoa tf omabq ltpqehad. Omabq delqbfbla, mtcajaq, ced ito bi jebi. Eo gaedo
        oct eqptqah hbjbdbtid, cmblm tomaqcbda ctugh meja kaai ouqiah ewebido oma Kqbobdm Avnahbobtieqz
        Ftqla, meh ot ka daio ot tjaqltpa omap. Omaz meja ehhah eitomaq newa ot oma wgtqbad tf oma gbwmo
        hbjbdbtid, eih oma obpa webiah aiekgah oma Wqejagbia ceoaq gbiad ot ka fgtthah eih ot ka magh kz oma
        Fqailm oqttnd.
            
        Omud bo ced omeo oma ntqo tf Huiybqy ced yano tnai. Cmai bo ced ftuih bpntddbkga ftq oma Eqpbad tf
        oma itqom ot qatnai omabq ltppuibleobtid ot Epbaid cbom oma pebi Fqailm Eqpbad, tigz tia lmtbla
        qapebiah. Bo daapah, bihaah, ftqgtqi. Oma Kagwbei, Kqbobdm eih Fqailm Eqpbad caqa egptdo duqqtuihah.
        Omabq dtga gbia tf qaoqaeo ced ot e dbiwga ntqo eih ot bod iabwmktqbiw kaelmad. Omaz caqa nqaddah ti
        ajaqz dbha kz maejz eooelyd eih feq tuoiupkaqah bi oma ebq.
            
        Cmai, e caay ewt othez, B edyah oma Mtuda ot fbv ombd efoaqitti ed oma tlledbti ftq e doeoapaio, B
        faeqah bo ctugh ka pz meqh gto ot eiituila oma wqaeoado pbgboeqz hbdedoaq bi tuq gtiw mbdotqz. B
        omtuwmo-eih dtpa wtth ruhwad ewqaah cbom pa-omeo naqmend 99,999 tq 99,999 pai pbwmo ka qa-apkeqyah.
        Kuo bo laqoebigz daapah omeo oma cmtga tf oma Fqailm Fbqdo Eqpz eih oma cmtga tf oma Kqbobdm
        Avnahbobtieqz Ftqla itqom tf oma Epbaid-Ekkajbgga wen ctugh ka kqtyai un bi oma tnai fbagh tq agda
        ctugh meja ot lenbougeoa ftq gely tf ftth eih eppuibobti. Omada caqa oma meqh eih maejz obhbiwd ftq
        cmblm B leggah unti oma Mtuda eih oma ieobti ot nqaneqa omapdagjad e caay ewt. Oma cmtga qtto eih
        ltqa eih kqebi tf oma Kqbobdm Eqpz, ti cmblm eih eqtuih cmblm ca caqa ot kubgh, eih eqa ot kubgh,
        oma wqaeo Kqbobdm Eqpbad bi oma geoaq zaeqd tf oma ceq, daapah ektuo ot naqbdm unti oma fbagh tq ot
        ka gah biot ei bwitpbibtud eih doeqjbiw lenobjboz.
            
        Omeo ced oma nqtdnalo e caay ewt. Kuo eitomaq kgtc cmblm pbwmo cagg meja nqtjah fbieg ced zao ot
        fegg unti ud. Oma Ybiw tf oma Kagwbeid meh leggah unti ud ot ltpa ot mbd ebh. Meh ito ombd Qugaq eih
        mbd Wtjaqipaio dajaqah omapdagjad fqtp oma Eggbad, cmt qadluah omabq ltuioqz fqtp avobilobti bi oma
        geoa ceq, eih meh omaz ito dtuwmo qafuwa bi cmeo ced nqtjah ot ka e feoeg iauoqegboz, oma Fqailm eih
        Kqbobdm Eqpbad pbwmo cagg eo oma tuodao meja dejah ito tigz Kagwbup kuo naqmend ajai Ntgeih. Zao eo
        oma gedo ptpaio, cmai Kagwbup ced egqaehz bijehah, Ybiw Gatntgh leggah unti ud ot ltpa ot mbd ebh,
        eih ajai eo oma gedo ptpaio ca lepa. Ma eih mbd kqeja, affblbaio Eqpz, iaeqgz megf e pbggbti doqtiw,
        wueqhah tuq gafo fgeiy eih omud yano tnai tuq tigz gbia tf qaoqaeo ot oma dae. Duhhaigz, cbomtuo
        nqbtq ltidugoeobti, cbom oma gaedo ntddbkga itobla, cbomtuo oma ehjbla tf mbd Pbibdoaqd eih unti mbd
        tci naqdtieg elo, ma daio e ngaibntoaiobeqz ot oma Waqpei Ltppeih, duqqaihaqah mbd Eqpz, eih avntdah
        tuq cmtga fgeiy eih paeid tf qaoqaeo.
            
        B edyah oma Mtuda e caay ewt ot dudnaih bod ruhwpaio kaleuda oma felod caqa ito lgaeq, kuo B ht ito
        faag omeo eiz qaedti itc avbdod cmz ca dmtugh ito ftqp tuq tci tnbibtid unti ombd nbobfug anbdtha.
        Oma duqqaihaq tf oma Kagwbei Eqpz ltpnaggah oma Kqbobdm eo oma dmtqoado itobla ot ltjaq e fgeiy ot
        oma dae ptqa omei 99 pbgad bi gaiwom. Tomaqcbda egg ctugh meja kaai luo tff, eih egg ctugh meja
        dmeqah oma feoa ot cmblm Ybiw Gatntgh meh ltihapiah oma fbiado Eqpz mbd ltuioqz meh ajaq ftqpah. Dt
        bi htbiw ombd eih bi avntdbiw ombd fgeiy, ed eiztia cmt ftggtcah oma tnaqeobtid ti oma pen cbgg daa,
        ltioelo ced gtdo kaocaai oma Kqbobdm eih oct tuo tf oma omqaa ltqnd ftqpbiw oma Fbqdo Fqailm Eqpz,
        cmt caqa dobgg feqomaq fqtp oma ltedo omei ca caqa, eih bo daapah bpntddbkga omeo eiz geqwa iupkaq
        tf Eggbah oqttnd ltugh qaelm oma ltedo.
            
        Oma aiapz eooelyah ti egg dbhad cbom wqaeo doqaiwom eih fbaqlaiadd, eih omabq pebi ntcaq, oma ntcaq
        tf omabq feq ptqa iupaqtud Ebq Ftqla, ced omqtci biot oma keooga tq agda ltilaioqeoah unti Huiybqy
        eih oma kaelmad. Nqaddbiw bi unti oma ieqqtc avbo, ktom fqtp oma aedo eih fqtp oma cado, oma aiapz
        kawei ot fbqa cbom leiiti unti oma kaelmad kz cmblm egtia oma dmbnnbiw ltugh ennqtelm tq haneqo.
        Omaz dtcah pewiaobl pbiad bi oma lmeiiagd eih daed; omaz daio qanaeoah cejad tf mtdobga ebqlqefo,
        dtpaobpad ptqa omei e muihqah doqtiw bi tia ftqpeobti, ot ledo omabq ktpkd unti oma dbiwga nbaq omeo
        qapebiah, eih unti oma deih huiad unti cmblm oma oqttnd meh omabq azad ftq dmagoaq. Omabq U-kteod,
        tia tf cmblm ced duiy, eih omabq ptotq geuilmad otty omabq otgg tf oma jedo oqeffbl cmblm itc kawei.
        Ftq ftuq tq fbja hezd ei bioaida doquwwga qabwiah. Egg omabq eqptqah hbjbdbtid-tq cmeo Ced gafo tf
        omap-otwaomaq cbom wqaeo peddad tf bifeioqz eih eqobggaqz, muqgah omapdagjad bi jebi unti oma
        ajaq-ieqqtcbiw, ajaq-ltioqelobiw ennaihbv cbombi cmblm oma Kqbobdm eih Fqailm Eqpbad ftuwmo.
            
        Paeicmbga, oma Qtzeg Iejz, cbom oma cbggbiw magn tf ltuiogadd paqlmeio daepai, doqebiah ajaqz iaqja
        ot apkeqy oma Kqbobdm eih Eggbah oqttnd; 999 gbwmo ceqdmbnd eih 999 tomaq jaddagd caqa aiwewah. Omaz
        meh ot tnaqeoa unti oma hbffblugo ltedo, tfoai bi ehjaqda caeomaq, uihaq ei egptdo laedagadd mebg tf
        ktpkd eih ei bilqaedbiw ltilaioqeobti tf eqobggaqz fbqa. Itq caqa oma daed, ed B meja debh,
        omapdagjad fqaa fqtp pbiad eih otqnahtad. Bo ced bi ltihbobtid dulm ed omada omeo tuq pai leqqbah
        ti, cbom gbooga tq it qado, ftq hezd eih ibwmod ti aih, peybiw oqbn efoaq oqbn elqtdd oma heiwaqtud
        ceoaqd, kqbiwbiw cbom omap egcezd pai cmtp omaz meh qadluah. Oma iupkaqd omaz meja kqtuwmo kely eqa
        oma paeduqa tf omabq hajtobti eih omabq ltuqewa. Oma mtdnboeg dmbnd, cmblm kqtuwmo tff peiz
        omtudeihd tf Kqbobdm eih Fqailm ctuihah, kabiw dt ngebigz peqyah caqa e dnalbeg oeqwao ftq Iexb
        ktpkd; kuo oma pai eih ctpai ti kteqh omap iajaq fegoaqah bi omabq huoz.
            
        Paeicmbga, oma Qtzeg Ebq Ftqla, cmblm meh egqaehz kaai bioaqjaibiw bi oma keooga, dt feq ed bod
        qeiwa ctugh eggtc, fqtp mtpa kedad, itc udah neqo tf bod pebi paoqtntgboei fbwmoaq doqaiwom, eih
        doquly eo oma Waqpei ktpkaqd eih eo oma fbwmoaqd cmblm bi geqwa iupkaqd nqtoaloah omap. Ombd
        doquwwga ced nqtoqeloah eih fbaqla. Duhhaigz oma dlaia med lgaeqah, oma lqedm eih omuihaq med ftq
        oma ptpaio-kuo tigz ftq oma ptpaio-hbah ecez. E pbqelga tf hagbjaqeila, elmbajah kz jegtq, kz
        naqdajaqeila, kz naqfalo hbdlbngbia, kz feugogadd daqjbla, kz qadtuqla, kz dybgg, kz uiltisuaqekga
        fbhagboz, bd peibfado ot ud egg. Oma aiapz ced muqgah kely kz oma qaoqaeobiw Kqbobdm eih Fqailm
        oqttnd. Ma ced dt qtuwmgz meihgah omeo ma hbh ito muqqz omabq haneqouqa daqbtudgz. Oma Qtzeg Ebq
        Ftqla aiwewah oma pebi doqaiwom tf oma Waqpei Ebq Ftqla, eih bifgbloah unti omap gtddad tf eo gaedo
        ftuq ot tia; eih oma Iejz, udbiw iaeqgz 9,999 dmbnd tf egg ybihd, leqqbah tjaq 999,999 pai, Fqailm
        eih Kqbobdm, tuo tf oma recd tf haeom eih dmepa, ot omabq ieobja geih eih ot oma oedyd cmblm gba
        bppahbeoagz emaeh. Ca pudo ka jaqz leqafug ito ot eddbwi ot ombd hagbjaqeila oma eooqbkuoad tf e
        jblotqz. Ceqd eqa ito cti kz ajelueobtid. Kuo omaqa ced e jblotqz bidbha ombd hagbjaqeila, cmblm
        dmtugh ka itoah. Bo ced webiah kz oma Ebq Ftqla. Peiz tf tuq dtghbaqd ltpbiw kely meja ito daai oma
        Ebq Ftqla eo ctqy; omaz dec tigz oma ktpkaqd cmblm adlenah bod nqtoalobja eooely. Omaz uihaqqeoa bod
        elmbajapaiod. B meja maeqh pulm oegy tf ombd; omeo bd cmz B wt tuo tf pz cez ot dez ombd. B cbgg
        oagg ztu ektuo bo.
            
        Ombd ced e wqaeo oqbeg tf doqaiwom kaocaai oma Kqbobdm eih Waqpei Ebq Ftqlad. Lei ztu ltilabja e
        wqaeoaq tkralobja ftq oma Waqpeid bi oma ebq omei ot peya ajelueobti fqtp omada kaelmad bpntddbkga,
        eih ot dbiy egg omada dmbnd cmblm caqa hbdngezah, egptdo ot oma avoaio tf omtudeihd? Ltugh omaqa
        meja kaai ei tkralobja tf wqaeoaq pbgboeqz bpntqoeila eih dbwibfbleila ftq oma cmtga nuqntda tf oma
        ceq omei ombd? Omaz oqbah meqh, eih omaz caqa kaeoai kely; omaz caqa fqudoqeoah bi omabq oedy. Ca
        wto oma Eqpz ecez; eih omaz meja nebh ftuqftgh ftq eiz gtddad cmblm omaz meja bifgbloah. Jaqz geqwa
        ftqpeobtid tf Waqpei eaqtngeiad-eih ca yitc omeo omaz eqa e jaqz kqeja qela-meja ouqiah ti dajaqeg
        tlledbtid fqtp oma eooely tf tia-sueqoaq tf omabq iupkaq tf oma Qtzeg Ebq Ftqla, eih meja hbdnaqdah
        bi hbffaqaio hbqalobtid. Ocagja eaqtngeiad meja kaai muioah kz oct. Tia eaqtngeia ced hqbjai biot
        oma ceoaq eih ledo ecez kz oma paqa lmeqwa tf e Kqbobdm eaqtngeia, cmblm meh it ptqa eppuibobti. Egg
        tf tuq oznad-oma Muqqbleia, oma Dnbofbqa eih oma iac Hafbeio-eih egg tuq nbgtod meja kaai jbihbleoah
        ed dunaqbtq ot cmeo omaz meja eo nqadaio ot fela.
            
        Cmai ca ltidbhaq mtc pulm wqaeoaq ctugh ka tuq ehjeioewa bi hafaihbiw oma ebq ektja ombd Bdgeih
        ewebido ei tjaqdaed eooely, B pudo dez omeo B fbih bi omada felod e duqa kedbd unti cmblm nqelobleg
        eih qaedduqbiw omtuwmod pez qado. B cbgg nez pz oqbkuoa ot omada ztuiw ebqpai. Oma wqaeo Fqailm Eqpz
        ced jaqz geqwagz, ftq oma obpa kabiw, ledo kely eih hbdouqkah kz oma tiqudm tf e fac omtudeihd tf
        eqptqah jamblgad. Pez bo ito egdt ka omeo oma leuda tf lbjbgbxeobti bodagf cbgg ka hafaihah kz oma
        dybgg eih hajtobti tf e fac omtudeih ebqpai? Omaqa iajaq med kaai, B dunntda, bi egg oma ctqgh, bi
        egg oma mbdotqz tf ceq, dulm ei tnntqouiboz ftq ztuom. Oma Yibwmod tf oma Qtuih Oekga, oma
        Lqudehaqd, egg fegg kely biot oma nedo-ito tigz hbdoeio kuo nqtdebl; omada ztuiw pai, wtbiw ftqom
        ajaqz ptqi ot wueqh omabq ieobja geih eih egg omeo ca doeih ftq, mtghbiw bi omabq meihd omada
        bidoqupaiod tf ltgtddeg eih dmeooaqbiw ntcaq, tf cmtp bo pez ka debh omeo
            
        	Ajaqz ptqi kqtuwmo ftqom e itkga lmeila
        	Eih ajaqz lmeila kqtuwmo ftqom e itkga yibwmo,
            
        hadaqja tuq wqeobouha, ed ht egg oma kqeja pai cmt, bi dt peiz cezd eih ti dt peiz tlledbtid, eqa
        qaehz, eih ltiobiua qaehz ot wbja gbfa eih egg ftq omabq ieobja geih.
            
        B qaouqi ot oma Eqpz. Bi oma gtiw daqbad tf jaqz fbaqla keoogad, itc ti ombd fqtio, itc ti omeo,
        fbwmobiw ti omqaa fqtiod eo tila, keoogad ftuwmo kz oct tq omqaa hbjbdbtid ewebido ei asueg tq
        dtpacmeo geqwaq iupkaq tf oma aiapz, eih ftuwmo fbaqlagz ti dtpa tf oma tgh wqtuihd omeo dt peiz tf
        ud yiac dt cagg-bi omada keoogad tuq gtddad bi pai meja avlaahah 99,999 ybggah, ctuihah eih pbddbiw.
        B oeya tlledbti ot avnqadd oma dzpneomz tf oma Mtuda ot egg cmt meja duffaqah kaqaejapaio tq cmt eqa
        dobgg eivbtud. Oma Nqadbhaio tf oma Kteqh tf Oqeha [Dbq Eihqac Huilei] bd ito maqa othez. Mbd dti
        med kaai ybggah, eih peiz bi oma Mtuda meja fago oma neiwd tf effgblobti bi oma dmeqnado ftqp. Kuo B
        cbgg dez ombd ektuo oma pbddbiw: Ca meja meh e geqwa iupkaq tf ctuihah ltpa mtpa defagz ot ombd
        ltuioqz, kuo B ctugh dez ektuo oma pbddbiw omeo omaqa pez ka jaqz peiz qantqoah pbddbiw cmt cbgg
        ltpa kely mtpa, dtpa hez, bi tia cez tq eitomaq. Bi oma ltifudbti tf ombd fbwmo bo bd biajboekga
        omeo peiz meja kaai gafo bi ntdbobtid cmaqa mtitq qasubqah it fuqomaq qadbdoeila fqtp omap.
            
        Ewebido ombd gtdd tf tjaq 99,999 pai, ca lei dao e feq maejbaq gtdd laqoebigz bifgbloah unti oma
        aiapz. Kuo tuq gtddad bi peoaqbeg eqa aitqptud. Ca meja naqmend gtdo tia-ombqh tf oma pai ca gtdo bi
        oma tnaibiw hezd tf oma keooga tf 99do Peqlm, 9999, kuo ca meja gtdo iaeqgz ed peiz wuid — iaeqgz
        tia omtudeih-eih egg tuq oqeidntqo, egg oma eqptqah jamblgad omeo caqa cbom oma Eqpz bi oma itqom.
        Ombd gtdd cbgg bpntda e fuqomaq hagez ti oma avneidbti tf tuq pbgboeqz doqaiwom. Omeo avneidbti meh
        ito kaai nqtlaahbiw ed feq ed ca meh mtnah. Oma kado tf egg ca meh ot wbja meh wtia ot oma Kqbobdm
        Avnahbobtieqz Ftqla, eih egomtuwm omaz meh ito oma iupkaqd tf oeiyd eih dtpa eqoblgad tf asubnpaio
        cmblm caqa hadbqekga, omaz caqa e jaqz cagg eih fbiagz asubnnah Eqpz. Omaz meh oma fbqdo-fqubod tf
        egg omeo tuq bihudoqz meh ot wbja, eih omeo bd wtia. Eih itc maqa bd ombd fuqomaq hagez. Mtc gtiw bo
        cbgg ka, mtc gtiw bo cbgg gedo, hanaihd unti oma avaqobtid cmblm ca peya bi ombd Bdgeih. Ei afftqo
        oma gbya tf cmblm med iajaq kaai daai bi tuq qaltqhd bd itc kabiw peha. Ctqy bd nqtlaahbiw
        ajaqzcmaqa, ibwmo eih hez, Duihezd eih caay hezd. Lenboeg eih Gektq meja ledo edbha omabq bioaqadod,
        qbwmod, eih ludotpd eih nuo omap biot oma ltppti dotly. Egqaehz oma fgtc tf puibobtid med gaenah
        ftqceqh. Omaqa bd it qaedti cmz ca dmtugh ito bi e fac ptiomd tjaqoeya oma duhhai eih daqbtud gtdd
        omeo med ltpa unti ud, cbomtuo qaoeqhbiw oma hajagtnpaio tf tuq waiaqeg nqtwqep.
            
        Iajaqomagadd, tuq omeiyfugiadd eo oma adlena tf tuq Eqpz eih dt peiz pai, cmtda gtjah tiad meja
        neddah omqtuwm ei ewtibxbiw caay, pudo ito kgbih ud ot oma felo omeo cmeo med mennaiah bi Fqeila eih
        Kagwbup bd e ltgtddeg pbgboeqz hbdedoaq. Oma Fqailm Eqpz med kaai caeyaiah, oma Kagwbei Eqpz med
        kaai gtdo, e geqwa neqo tf omtda ftqobfbah gbiad unti cmblm dt pulm febom meh kaai qantdah bd wtia,
        peiz jeguekga pbibiw hbdoqblod eih felotqbad meja neddah biot oma aiapz’d ntddaddbti, oma cmtga tf
        oma Lmeiiag ntqod eqa bi mbd meihd, cbom egg oma oqewbl ltidasuailad omeo ftggtc fqtp omeo, eih ca
        pudo avnalo eitomaq kgtc ot ka doquly egptdo bppahbeoagz eo ud tq eo Fqeila. Ca eqa otgh omeo Maqq
        Mbogaq med e ngei ftq bijehbiw oma Kqbobdm Bdgad. Ombd med tfoai kaai omtuwmo tf kaftqa. Cmai
        Ientgati gez eo Ktugtwia ftq e zaeq cbom mbd fgeo-ktootpah kteod eih mbd Wqeih Eqpz, ma ced otgh kz
        dtpatia. “Omaqa eqa kbooaq caahd bi Aiwgeih.” Omaqa eqa laqoebigz e wqaeo peiz ptqa tf omap dbila
        oma Kqbobdm Avnahbobtieqz Ftqla qaouqiah.
            
        Oma cmtga suadobti tf mtpa hafaida ewebido bijedbti bd, tf ltuqda, ntcaqfuggz effaloah kz oma felo
        omeo ca meja ftq oma obpa kabiw bi ombd Bdgeih biltpneqekgz ptqa ntcaqfug pbgboeqz ftqlad omei ca
        meja ajaq meh eo eiz ptpaio bi ombd ceq tq oma gedo. Kuo ombd cbgg ito ltiobiua. Ca dmegg ito ka
        ltioaio cbom e hafaidbja ceq. Ca meja tuq huoz ot tuq Eggz. Ca meja ot qaltidobouoa eih kubgh un oma
        Kqbobdm Avnahbobtieqz Ftqla tila ewebi, uihaq bod weggeio Ltppeihaq-bi-Lmbaf, Gtqh Wtqo. Egg ombd bd
        bi oqebi; kuo bi oma bioaqjeg ca pudo nuo tuq hafaidad bi ombd Bdgeih biot dulm e mbwm doeoa tf
        tqweibxeobti omeo oma facado ntddbkga iupkaqd cbgg ka qasubqah ot wbja affalobja daluqboz eih omeo
        oma geqwado ntddbkga ntoaiobeg tf tffaidbja afftqo pez ka qaegbxah. Ti ombd ca eqa itc aiwewah. Bo
        cbgg ka jaqz ltijaibaio, bf bo ka oma hadbqa tf oma Mtuda, ot aioaq unti ombd dukralo bi e dalqao
        Daddbti. Ito omeo oma wtjaqipaio ctugh ialaddeqbgz ka ekga ot qajaeg bi jaqz wqaeo haoebg pbgboeqz
        dalqaod, kuo ca gbya ot meja tuq hbdluddbtid fqaa, cbomtuo oma qadoqebio bpntdah kz oma felo omeo
        omaz cbgg ka qaeh oma iavo hez kz oma aiapz; eih oma Wtjaqipaio ctugh kaiafbo kz jbacd fqaagz
        avnqaddah bi egg neqod tf oma Mtuda kz Papkaqd cbom omabq yitcgahwa tf dt peiz hbffaqaio neqod tf
        oma ltuioqz. B uihaqdoeih omeo dtpa qasuado bd ot ka peha unti ombd dukralo, cmblm cbgg ka qaehbgz
        ellahah ot kz Mbd Peradoz’d Wtjaqipaio.
            
        Ca meja ftuih bo ialaddeqz ot oeya paeduqad tf bilqaedbiw doqbiwailz, ito tigz ewebido aiapz egbaid
        eih dudnblbtud lmeqeloaqd tf tomaq ieobtiegbobad, kuo egdt ewebido Kqbobdm dukralod cmt pez kaltpa e
        heiwaq tq e iubdeila dmtugh oma ceq ka oqeidntqoah ot oma Uiboah Ybiwhtp. B yitc omaqa eqa e wqaeo
        peiz natnga effaloah kz oma tqhaqd cmblm ca meja peha cmt eqa oma neddbtieoa aiapbad tf Iexb
        Waqpeiz. B ep jaqz dtqqz ftq omap, kuo ca leiito, eo oma nqadaio obpa eih uihaq oma nqadaio doqadd,
        hqec egg oma hbdobilobtid cmblm ca dmtugh gbya ot ht. Bf neqelmuoa geihbiwd caqa eooapnoah eih
        fbaqla fbwmobiw eooaiheio unti omap ftggtcah, omada uiftqouieoa natnga ctugh ka feq kaooaq tuo tf
        oma cez, ftq omabq tci deyad ed cagg ed ftq tuqd. Omaqa bd, mtcajaq, eitomaq lgedd, ftq cmblm B faag
        ito oma dgbwmoado dzpneomz. Neqgbepaio med wbjai ud oma ntcaqd ot nuo htci Fbfom Ltgupi elobjbobad
        cbom e doqtiw meih, eih ca dmegg uda omtda ntcaqd dukralo ot oma dunaqjbdbti eih ltqqalobti tf oma
        Mtuda, cbomtuo oma dgbwmoado madboeobti uiobg ca eqa deobdfbah, eih ptqa omei deobdfbah, omeo ombd
        pegbwieilz bi tuq pbhdo med kaai affalobjagz doepnah tuo.
            
        Ouqibiw tila ewebi, eih ombd obpa ptqa waiaqeggz, ot oma suadobti tf bijedbti, B ctugh tkdaqja omeo
        omaqa med iajaq kaai e naqbth bi egg omada gtiw laiouqbad tf cmblm ca ktedo cmai ei ekdtguoa
        wueqeioaa ewebido bijedbti, dobgg gadd ewebido daqbtud qebhd, ltugh meja kaai wbjai ot tuq natnga.
        Bi oma hezd tf Ientgati oma depa cbih cmblm ctugh meja leqqbah mbd oqeidntqod elqtdd oma Lmeiiag
        pbwmo meja hqbjai ecez oma kgtlyehbiw fgaao. Omaqa ced egcezd oma lmeila, eih bo bd omeo lmeila
        cmblm med avlboah eih kafttgah oma bpewbieobtid tf peiz Ltiobiaioeg ozqeiod. Peiz eqa oma oegad omeo
        eqa otgh. Ca eqa edduqah omeo itjag paomthd cbgg ka ehtnoah, eih cmai ca daa oma tqbwbiegboz tf
        pegbla, oma biwaiuboz tf ewwqaddbti, cmblm tuq aiapz hbdngezd, ca pez laqoebigz nqaneqa tuqdagjad
        ftq ajaqz ybih tf itjag doqeoewap eih ajaqz ybih tf kquoeg eih oqaelmaqtud peiaujaq. B ombiy omeo it
        bhae bd dt tuogeihbdm omeo bo dmtugh ito ka ltidbhaqah eih jbacah cbom e daeqlmbiw, kuo eo oma depa
        obpa, B mtna, cbom e doaehz aza. Ca pudo iajaq ftqwao oma dtgbh edduqeilad tf dae ntcaq eih omtda
        cmblm kagtiw ot ebq ntcaq bf bo lei ka gtleggz avaqlbdah.
            
        B meja, pzdagf, fugg ltifbhaila omeo bf egg ht omabq huoz, bf itombiw bd iawgaloah, eih bf oma kado
        eqqeiwapaiod eqa peha, ed omaz eqa kabiw peha, ca dmegg nqtja tuqdagjad tila ewebi ekga ot hafaih
        tuq Bdgeih mtpa, ot qbha tuo oma dotqp tf ceq, eih ot tuogbja oma paiela tf ozqeiiz, bf ialaddeqz
        ftq zaeqd, bf ialaddeqz egtia. Eo eiz qeoa, omeo bd cmeo ca eqa wtbiw ot oqz ot ht. Omeo bd oma
        qadtgja tf Mbd Peradoz’d Wtjaqipaio-ajaqz pei tf omap. Omeo bd oma cbgg tf Neqgbepaio eih oma
        ieobti. Oma Kqbobdm Apnbqa eih oma Fqailm Qanukgbl, gbiyah otwaomaq bi omabq leuda eih bi omabq
        iaah, cbgg hafaih ot oma haeom omabq ieobja dtbg, ebhbiw aelm tomaq gbya wtth ltpqehad ot oma uoptdo
        tf omabq doqaiwom. Ajai omtuwm geqwa oqelod tf Auqtna eih peiz tgh eih feptud Doeoad meja feggai tq
        pez fegg biot oma wqbn tf oma Wadoent eih egg oma thbtud enneqeoud tf Iexb quga, ca dmegg ito fgew
        tq febg. Ca dmegg wt ti ot oma aih, ca dmegg fbwmo bi Fqeila, ca dmegg fbwmo ti oma daed eih tlaeid,
        ca dmegg fbwmo cbom wqtcbiw ltifbhaila eih wqtcbiw doqaiwom bi oma ebq, ca dmegg hafaih tuq Bdgeih,
        cmeoajaq oma ltdo pez ka, ca dmegg fbwmo ti oma kaelmad, ca dmegg fbwmo ti oma geihbiw wqtuihd, ca
        dmegg fbwmo bi oma fbaghd eih bi oma doqaaod, ca dmegg fbwmo bi oma mbggd; ca dmegg iajaq duqqaihaq,
        eih ajai bf, cmblm B ht ito ftq e ptpaio kagbaja, ombd Bdgeih tq e geqwa neqo tf bo caqa dukruweoah
        eih doeqjbiw, omai tuq Apnbqa kaztih oma daed, eqpah eih wueqhah kz oma Kqbobdm Fgaao, ctugh leqqz
        ti oma doquwwga, uiobg, bi Wth’d wtth obpa, oma Iac Ctqgh, cbom egg bod ntcaq eih pbwmo, doand ftqom
        ot oma qadlua eih oma gbkaqeobti tf oma tgh.
        """;
    var plain = decrypt(cipher, 3);
    assertEquals("Churchill", Dinglemouse.who(3, cipher));
    assertEquals(cipher.length(), plain.length());
  }

  @Test
  void forthText() {
    var cipher = """
        F ts jtuui gy vyfl afgj iyo gynti fl ajtg afrr ey nyal fl jfbgyxi tb gjm exmtgmbg nmsylbgxtgfyl wyx
        wxmmnys fl gjm jfbgyxi yw yox ltgfyl.
            
        Wfzm bcyxm imtxb tey, t exmtg Tsmxfctl, fl ajybm bispyrfc bjtnya am bgtln gynti, bfelmn gjm
        Mstlcfutgfyl Uxycrtstgfyl. Gjfb sysmlgyob nmcxmm ctsm tb t exmtg pmtcyl rfejg yw jyum gy sfrrfylb yw
        Lmexy brtzmb ajy jtn pmml bmtxmn fl gjm wrtsmb yw afgjmxfle flvobgfcm. Fg ctsm tb t vyiyob ntipxmtd
        gy mln gjm ryle lfejg yw gjmfx ctugfzfgi.
            
        Pog ylm jolnxmn imtxb rtgmx, gjm Lmexy bgfrr fb lyg wxmm. Ylm jolnxmn imtxb rtgmx, gjm rfwm yw gjm
        Lmexy fb bgfrr btnri cxfuurmn pi gjm stltcrmb yw bmexmetgfyl tln gjm cjtflb yw nfbcxfsfltgfyl. Ylm
        jolnxmn imtxb rtgmx, gjm Lmexy rfzmb yl t rylmri fbrtln yw uyzmxgi fl gjm sfnbg yw t ztbg ycmtl yw
        stgmxftr uxybumxfgi. Ylm jolnxmn imtxb rtgmx, gjm Lmexy fb bgfrr rtleofbjmn fl gjm cyxlmxb yw
        Tsmxfctl bycfmgi tln wflnb jfsbmrw tl mkfrm fl jfb yal rtln. Tln by am’zm cysm jmxm gynti gy
        nxtstgfqm t bjtsmwor cylnfgfyl.
            
        Fl t bmlbm am’zm cysm gy yox ltgfyl’b ctufgtr gy ctbj t cjmcd. Ajml gjm txcjfgmcgb yw yox xmuoprfc
        axygm gjm stelfwfcmlg ayxnb yw gjm Cylbgfgogfyl tln gjm Nmcrtxtgfyl yw Flnmumlnmlcm, gjmi amxm
        bfelfle t uxysfbbyxi lygm gy ajfcj mzmxi Tsmxfctl atb gy wtrr jmfx. Gjfb lygm atb t uxysfbm gjtg trr
        sml, imb, prtcd sml tb amrr tb ajfgm sml, ayorn pm eotxtlgmmn gjm “oltrfmltprm Xfejgb” yw “Rfwm,
        Rfpmxgi tln gjm uoxbofg yw Jtuuflmbb.” Fg fb ypzfyob gynti gjtg Tsmxfct jtb nmwtorgmn yl gjfb
        uxysfbbyxi lygm, flbywtx tb jmx cfgfqmlb yw cyryx txm cylcmxlmn. Flbgmtn yw jylyxfle gjfb btcxmn
        yprfetgfyl, Tsmxfct jtb efzml gjm Lmexy umyurm t ptn cjmcd, t cjmcd ajfcj jtb cysm ptcd stxdmn
        “flbowwfcfmlg wolnb.”
            
        Pog am xmwobm gy pmrfmzm gjtg gjm ptld yw vobgfcm fb ptldxoug. Am xmwobm gy pmrfmzm gjtg gjmxm txm
        flbowwfcfmlg wolnb fl gjm exmtg ztorgb yw yuuyxgolfgi yw gjfb ltgfyl. Tln by, am’zm cysm gy ctbj
        gjfb cjmcd, t cjmcd gjtg afrr efzm ob ouyl nmstln gjm xfcjmb yw wxmmnys tln gjm bmcoxfgi yw vobgfcm.
            
        Am jtzm trby cysm gy gjfb jtrryamn buyg gy xmsfln Tsmxfct yw gjm wfmxcm oxemlci yw Lya. Gjfb fb ly
        gfsm gy mletem fl gjm rokoxi yw cyyrfle yww yx gy gtdm gjm gxtlhofrfqfle nxoe yw extnotrfbs. Lya fb
        gjm gfsm gy stdm xmtr gjm uxysfbmb yw nmsycxtci. Lya fb gjm gfsm gy xfbm wxys gjm ntxd tln nmbyrtgm
        ztrrmi yw bmexmetgfyl gy gjm bolrfg utgj yw xtcftr vobgfcm. Lya fb gjm gfsm gy rfwg yox ltgfyl wxys
        gjm hofcdbtlnb yw xtcftr flvobgfcm gy gjm byrfn xycd yw pxygjmxjyyn. Lya fb gjm gfsm gy stdm vobgfcm
        t xmtrfgi wyx trr yw Eyn’b cjfrnxml.
            
        Fg ayorn pm wtgtr wyx gjm ltgfyl gy yzmxryyd gjm oxemlci yw gjm sysmlg. Gjfb bamrgmxfle bossmx yw
        gjm Lmexy’b rmefgfstgm nfbcylgmlg afrr lyg utbb olgfr gjmxm fb tl flzfeyxtgfle togosl yw wxmmnys tln
        mhotrfgi. Lflmgmml bfkgi-gjxmm fb lyg tl mln, pog t pmefllfle. Tln gjybm ajy jyum gjtg gjm Lmexy
        lmmnmn gy prya yww bgmts tln afrr lya pm cylgmlg afrr jtzm t xonm tatdmlfle fw gjm ltgfyl xmgoxlb gy
        pobflmbb tb obotr. Tln gjmxm afrr pm lmfgjmx xmbg lyx gxtlhofrfgi fl Tsmxfct olgfr gjm Lmexy fb
        extlgmn jfb cfgfqmlbjfu xfejgb. Gjm ajfxraflnb yw xmzyrg afrr cylgflom gy bjtdm gjm wyolntgfylb yw
        yox ltgfyl olgfr gjm pxfejg nti yw vobgfcm msmxemb.
            
        Pog gjmxm fb bysmgjfle gjtg F sobg bti gy si umyurm, ajy bgtln yl gjm atxs gjxmbjyrn ajfcj rmtnb
        flgy gjm utrtcm yw vobgfcm: Fl gjm uxycmbb yw etflfle yox xfejgwor urtcm, am sobg lyg pm eofrgi yw
        axylewor nmmnb. Rmg ob lyg bmmd gy btgfbwi yox gjfxbg wyx wxmmnys pi nxfldfle wxys gjm cou yw
        pfggmxlmbb tln jtgxmn. Am sobg wyxmzmx cylnocg yox bgxoeerm yl gjm jfej urtlm yw nfelfgi tln
        nfbcfurflm. Am sobg lyg trrya yox cxmtgfzm uxygmbg gy nmemlmxtgm flgy ujibfctr zfyrmlcm. Tetfl tln
        tetfl, am sobg xfbm gy gjm stvmbgfc jmfejgb yw smmgfle ujibfctr wyxcm afgj byor wyxcm.
            
        Gjm stxzmryob lma sfrfgtlci ajfcj jtb mleorwmn gjm Lmexy cyssolfgi sobg lyg rmtn ob gy t nfbgxobg yw
        trr ajfgm umyurm, wyx stli yw yox ajfgm pxygjmxb, tb mzfnmlcmn pi gjmfx uxmbmlcm jmxm gynti, jtzm
        cysm gy xmtrfqm gjtg gjmfx nmbgfli fb gfmn ou afgj yox nmbgfli. Tln gjmi jtzm cysm gy xmtrfqm gjtg
        gjmfx wxmmnys fb flmkgxfctpri pyoln gy yox wxmmnys.
            
        Am ctllyg atrd trylm.
            
        Tln tb am atrd, am sobg stdm gjm urmnem gjtg am bjtrr tratib stxcj tjmtn.
            
        Am ctllyg goxl ptcd.
            
        Gjmxm txm gjybm ajy txm tbdfle gjm nmzygmmb yw cfzfr xfejgb, “Ajml afrr iyo pm btgfbwfmn?” Am ctl
        lmzmx pm btgfbwfmn tb ryle tb gjm Lmexy fb gjm zfcgfs yw gjm olbumtdtprm jyxxyxb yw uyrfcm
        pxogtrfgi. Am ctl lmzmx pm btgfbwfmn tb ryle tb yox pynfmb, jmtzi afgj gjm wtgfeom yw gxtzmr, ctllyg
        etfl rynefle fl gjm sygmrb yw gjm jfejatib tln gjm jygmrb yw gjm cfgfmb. Am ctllyg pm btgfbwfmn tb
        ryle tb gjm lmexy’b ptbfc sypfrfgi fb wxys t bstrrmx ejmggy gy t rtxemx ylm. Am ctl lmzmx pm
        btgfbwfmn tb ryle tb yox cjfrnxml txm bgxfuumn yw gjmfx bmrw-jyyn tln xyppmn yw gjmfx nfelfgi pi t
        bfel bgtgfle: “Wyx Ajfgmb Ylri.” Am ctllyg pm btgfbwfmn tb ryle tb t Lmexy fl Sfbbfbbfuuf ctllyg
        zygm tln t Lmexy fl Lma Iyxd pmrfmzmb jm jtb lygjfle wyx ajfcj gy zygm. Ly, ly, am txm lyg
        btgfbwfmn, tln am afrr lyg pm btgfbwfmn olgfr “vobgfcm xyrrb nyal rfdm atgmxb, tln xfejgmyoblmbb
        rfdm t sfejgi bgxmts.”
            
        F ts lyg olsflnwor gjtg bysm yw iyo jtzm cysm jmxm yog yw exmtg gxftrb tln gxfportgfylb. Bysm yw iyo
        jtzm cysm wxmbj wxys ltxxya vtfr cmrrb. Tln bysm yw iyo jtzm cysm wxys txmtb ajmxm iyox hombg —
        hombg wyx wxmmnys rmwg iyo ptggmxmn pi gjm bgyxsb yw umxbmcogfyl tln bgteemxmn pi gjm aflnb yw
        uyrfcm pxogtrfgi. Iyo jtzm pmml gjm zmgmxtlb yw cxmtgfzm bowwmxfle. Cylgflom gy ayxd afgj gjm wtfgj
        gjtg olmtxlmn bowwmxfle fb xmnmsugfzm. Ey ptcd gy Sfbbfbbfuuf, ey ptcd gy Trtptst, ey ptcd gy Byogj
        Ctxyrflt, ey ptcd gy Emyxeft, ey ptcd gy Ryofbftlt, ey ptcd gy gjm brosb tln ejmggyb yw yox lyxgjmxl
        cfgfmb, dlyafle gjtg bysmjya gjfb bfgotgfyl ctl tln afrr pm cjtlemn.
            
        Rmg ob lyg atrrya fl gjm ztrrmi yw nmbutfx, F bti gy iyo gynti, si wxfmlnb.
            
        Tln by mzml gjyoej am wtcm gjm nfwwfcorgfmb yw gynti tln gysyxxya, F bgfrr jtzm t nxmts. Fg fb t
        nxmts nmmuri xyygmn fl gjm Tsmxfctl nxmts.
            
        F jtzm t nxmts gjtg ylm nti gjfb ltgfyl afrr xfbm ou tln rfzm yog gjm gxom smtlfle yw fgb cxmmn: “Am
        jyrn gjmbm gxogjb gy pm bmrw-mzfnmlg, gjtg trr sml txm cxmtgmn mhotr.”
            
        F jtzm t nxmts gjtg ylm nti yl gjm xmn jfrrb yw Emyxeft, gjm bylb yw wyxsmx brtzmb tln gjm bylb yw
        wyxsmx brtzm yalmxb afrr pm tprm gy bfg nyal gyemgjmx tg gjm gtprm yw pxygjmxjyyn.
            
        F jtzm t nxmts gjtg ylm nti mzml gjm bgtgm yw Sfbbfbbfuuf, t bgtgm bamrgmxfle afgj gjm jmtg yw
        flvobgfcm, bamrgmxfle afgj gjm jmtg yw yuuxmbbfyl, afrr pm gxtlbwyxsmn flgy tl ytbfb yw wxmmnys tln
        vobgfcm.
            
        F jtzm t nxmts gjtg si wyox rfggrm cjfrnxml afrr ylm nti rfzm fl t ltgfyl ajmxm gjmi afrr lyg pm
        vonemn pi gjm cyryx yw gjmfx bdfl pog pi gjm cylgmlg yw gjmfx cjtxtcgmx.
            
        F jtzm t nxmts gynti!
            
        F jtzm t nxmts gjtg ylm nti, nyal fl Trtptst, afgj fgb zfcfyob xtcfbgb, afgj fgb eyzmxlyx jtzfle jfb
        rfub nxfuufle afgj gjm ayxnb yw “flgmxuybfgfyl” tln “lorrfwfctgfyl” — ylm nti xfejg gjmxm fl Trtptst
        rfggrm prtcd pyib tln prtcd efxrb afrr pm tprm gy vyfl jtlnb afgj rfggrm ajfgm pyib tln ajfgm efxrb
        tb bfbgmxb tln pxygjmxb.
            
        F jtzm t nxmts gynti!
            
        F jtzm t nxmts gjtg ylm nti mzmxi ztrrmi bjtrr pm mktrgmn, tln mzmxi jfrr tln syolgtfl bjtrr pm stnm
        rya, gjm xyoej urtcmb afrr pm stnm urtfl, tln gjm cxyydmn urtcmb afrr pm stnm bgxtfejg; “tln gjm
        eryxi yw gjm Ryxn bjtrr pm xmzmtrmn tln trr wrmbj bjtrr bmm fg gyemgjmx.”
            
        Gjfb fb yox jyum, tln gjfb fb gjm wtfgj gjtg F ey ptcd gy gjm Byogj afgj.
            
        Afgj gjfb wtfgj, am afrr pm tprm gy jma yog yw gjm syolgtfl yw nmbutfx t bgylm yw jyum. Afgj gjfb
        wtfgj, am afrr pm tprm gy gxtlbwyxs gjm vtlerfle nfbcyxnb yw yox ltgfyl flgy t pmtogfwor bisujyli yw
        pxygjmxjyyn. Afgj gjfb wtfgj, am afrr pm tprm gy ayxd gyemgjmx, gy uxti gyemgjmx, gy bgxoeerm
        gyemgjmx, gy ey gy vtfr gyemgjmx, gy bgtln ou wyx wxmmnys gyemgjmx, dlyafle gjtg am afrr pm wxmm ylm
        nti.
            
        Tln gjfb afrr pm gjm nti — gjfb afrr pm gjm nti ajml trr yw Eyn’b cjfrnxml afrr pm tprm gy bfle afgj
        lma smtlfle:
            
        	Si cyolgxi ’gfb yw gjmm, bammg rtln yw rfpmxgi, yw gjmm F bfle.
        	Rtln ajmxm si wtgjmxb nfmn, rtln yw gjm Ufrexfs’b uxfnm,
        	Wxys mzmxi syolgtflbfnm, rmg wxmmnys xfle!
            
        Tln fw Tsmxfct fb gy pm t exmtg ltgfyl, gjfb sobg pmcysm gxom.
            
        Tln by rmg wxmmnys xfle wxys gjm uxynfefyob jfrrgyub yw Lma Jtsubjfxm.
            
        	Rmg wxmmnys xfle wxys gjm sfejgi syolgtflb yw Lma Iyxd.
        	Rmg wxmmnys xfle wxys gjm jmfejgmlfle Trrmejmlfmb yw Umllbirztlft.
        	Rmg wxmmnys xfle wxys gjm blya-ctuumn Xycdfmb yw Cyryxtny.
        	Rmg wxmmnys xfle wxys gjm coxztcmyob bryumb yw Ctrfwyxlft.
            
        Pog lyg ylri gjtg:
            
        	Rmg wxmmnys xfle wxys Bgylm Syolgtfl yw Emyxeft.
        	Rmg wxmmnys xfle wxys Ryydyog Syolgtfl yw Gmllmbbmm.
        	Rmg wxmmnys xfle wxys mzmxi jfrr tln syrmjfrr yw Sfbbfbbfuuf.
        	Wxys mzmxi syolgtflbfnm, rmg wxmmnys xfle.
            
        Tln ajml gjfb jtuumlb, ajml am trrya wxmmnys xfle, ajml am rmg fg xfle wxys mzmxi zfrrtem tln mzmxi
        jtsrmg, wxys mzmxi bgtgm tln mzmxi cfgi, am afrr pm tprm gy bummn ou gjtg nti ajml trr yw Eyn’b
        cjfrnxml, prtcd sml tln ajfgm sml, Vmab tln Emlgfrmb, Uxygmbgtlgb tln Ctgjyrfcb, afrr pm tprm gy
        vyfl jtlnb tln bfle fl gjm ayxnb yw gjm yrn Lmexy bufxfgotr:
            
        Wxmm tg rtbg! Wxmm tg rtbg!
            
        Gjtld Eyn Trsfejgi, am txm wxmm tg rtbg!
        """;
    var plain = decrypt(cipher, 4);
    assertEquals("King", Dinglemouse.who(4, cipher));
    assertEquals(cipher.length(), plain.length());
  }

  @Test
  void fifthText() {
    var cipher = """
        H oluic bwc ubwcy kfv up bwc euduoofd xhdhbfyv khofobcy jwhew ueetyyck jwcq bwc Pycqew Whzw Euxxfqk
        pfhdck bu jhbwkyfj bwc quybwcyq Fyxhco pyux Mcdzhtx fb bwc xuxcqb jwcq bwcv iqcj bwfb bwc Pycqew
        pyuqb jfo kcehohrcdv myuicq fb Ockfq fqk uq bwc Xctoc. Bwho kcdfv cqbfhdck bwc duoo up phpbccq uy
        ohgbccq Pycqew khrhohuqo fqk bwycj utb up febhuq puy bwc eyhbhefd lcyhuk bwc jwudc up bwc Myhbhow
        Cglckhbhuqfyv Puyec. Uty Fyxv fqk 999,999 Pycqew byuulo jcyc hqkcck ycoetck mv bwc Myhbhow Qfrv pyux
        Ktqihyi mtb uqdv jhbw bwc duoo up bwchy efqquq, rcwhedco fqk xukcyq csthlxcqb. Bwho duoo hqcrhbfmdv
        buui ouxc jccio bu yclfhy, fqk hq bwc phyob bju up bwuoc jccio bwc mfbbdc hq Pyfqec wfo mccq duob.
        Jwcq jc euqohkcy bwc wcyuhe ycohobfqec xfkc mv bwc Pycqew Fyxv fzfhqob wcfrv ukko hq bwho mfbbdc,
        bwc cquyxuto duooco hqpdhebck tluq bwc cqcxv fqk bwc crhkcqb cgwftobhuq up bwc cqcxv, hb xfv jcdd mc
        bwc bwutzwb bwfb bwcoc 99 khrhohuqo up bwc mcob-byfhqck fqk mcob-csthllck byuulo xhzwb wfrc btyqck
        bwc oefdc. Wujcrcy, Zcqcyfd Jcvzfqk wfk bu phzwb jhbwutb bwcx. Uqdv bwycc Myhbhow khrhohuqo uy bwchy
        csthrfdcqb jcyc fmdc bu obfqk hq bwc dhqc jhbw bwchy Pycqew euxyfkco. Bwcv wfrc otppcyck ocrcycdv,
        mtb bwcv wfrc putzwb jcdd. Jc ocqb crcyv xfq jc eutdk bu Pyfqec fo pfob fo jc eutdk yc-csthl fqk
        byfqoluyb bwchy puyxfbhuqo.
            
        H fx qub ycehbhqz bwcoc pfebo puy bwc ltyluoc up yceyhxhqfbhuq. Bwfb H atkzc bu mc tbbcydv ptbhdc
        fqk crcq wfyxptd. Jc efqqub fppuyk hb. H ycehbc bwcx hq uykcy bu cgldfhq jwv hb jfo jc khk qub wfrc,
        fo jc eutdk wfrc wfk, mcbjccq bjcdrc fqk putybccq Myhbhow khrhohuqo phzwbhqz hq bwc dhqc hq bwho
        zycfb mfbbdc hqobcfk up uqdv bwycc. Quj H ltb fdd bwho fohkc. H ltb hb uq bwc owcdp, pyux jwhew bwc
        whobuyhfqo, jwcq bwcv wfrc bhxc, jhdd ocdceb bwchy kuetxcqbo bu bcdd bwchy obuyhco. Jc wfrc bu bwhqi
        up bwc ptbtyc fqk qub up bwc lfob. Bwho fdou flldhco hq f oxfdd jfv bu uty ujq fppfhyo fb wuxc.
        Bwcyc fyc xfqv jwu jutdk wudk fq hqstcob hq bwc Wutoc up Euxxuqo uq bwc euqkteb up bwc
        Zurcyqxcqbo-fqk up Lfydhfxcqbo, puy bwcv fyc hq hb, buu-ktyhqz bwc vcfyo jwhew dck tl bu bwho
        efbfobyulwc. Bwcv occi bu hqkheb bwuoc jwu jcyc ycoluqohmdc puy bwc zthkfqec up uty fppfhyo. Bwho
        fdou jutdk mc f puudhow fqk lcyqhehuto lyuecoo. Bwcyc fyc buu xfqv hq hb. Dcb cfew xfq ocfyew who
        euqoehcqec fqk ocfyew who olccewco. H pycstcqbdv ocfyew xhqc.
            
        Up bwho H fx sthbc otyc, bwfb hp jc ulcq f stfyycd mcbjccq bwc lfob fqk bwc lycocqb, jc owfdd phqk
        bwfb jc wfrc duob bwc ptbtyc. Bwcycpuyc, H efqqub feeclb bwc kyfjhqz up fqv khobhqebhuqo mcbjccq
        Xcxmcyo up bwc lycocqb Zurcyqxcqb. Hb jfo puyxck fb f xuxcqb up eyhoho hq uykcy bu tqhbc fdd bwc
        Lfybhco fqk fdd ocebhuqo up ulhqhuq. Hb wfo ycechrck bwc fdxuob tqfqhxuto otlluyb up mubw Wutoco up
        Lfydhfxcqb. Hbo Xcxmcyo fyc zuhqz bu obfqk buzcbwcy, fqk, otmaceb bu bwc ftbwuyhbv up bwc Wutoc up
        Euxxuqo, jc fyc zuhqz bu zurcyq bwc eutqbyv fqk phzwb bwc jfy. Hb ho fmoudtbcdv qcecoofyv fb f bhxc
        dhic bwho bwfb crcyv Xhqhobcy jwu byhco cfew kfv bu ku who ktbv owfdd mc ycolcebck; fqk bwchy
        otmuykhqfbco xtob iquj bwfb bwchy ewhcpo fyc qub bwycfbcqck xcq, xcq jwu fyc wcyc bukfv fqk zuqc
        buxuyyuj, mtb bwfb bwchy khycebhuqo xtob mc ltqebtfddv fqk pfhbwptddv umcvck. Jhbwutb bwho
        euqecqbyfbck lujcy jc efqqub pfec jwfb dhco mcpuyc to. H owutdk qub bwhqi hb jutdk mc rcyv
        fkrfqbfzcuto puy bwc Wutoc bu lyuduqz bwho Kcmfbc bwho fpbcyquuq tqkcy euqkhbhuqo up ltmdhe obycoo.
        Xfqv pfebo fyc qub edcfy bwfb jhdd mc edcfy hq f owuyb bhxc. Jc fyc bu wfrc f oceycb Ocoohuq uq
        Bwtyokfv, fqk H owutdk bwhqi bwfb jutdk mc f mcbbcy ulluybtqhbv puy bwc xfqv cfyqcob cglycoohuqo up
        ulhqhuq jwhew Xcxmcyo jhdd kcohyc bu xfic fqk puy bwc Wutoc bu khoetoo rhbfd xfbbcyo jhbwutb wfrhqz
        crcyvbwhqz ycfk bwc qcgb xuyqhqz mv uty kfqzcyuto puco.
            
        Bwc khofobyuto xhdhbfyv crcqbo jwhew wfrc wfllcqck ktyhqz bwc lfob puybqhzwb wfrc qub euxc bu xc
        jhbw fqv ocqoc up otylyhoc. Hqkcck, H hqkhefbck f puybqhzwb fzu fo edcfydv fo H eutdk bu bwc Wutoc
        bwfb bwc juyob luoohmhdhbhco jcyc ulcq; fqk H xfkc hb lcypcebdv edcfy bwcq bwfb jwfbcrcy wfllcqck hq
        Pyfqec jutdk xfic qu khppcycqec bu bwc ycoudrc up Myhbfhq fqk bwc Myhbhow Cxlhyc bu phzwb uq, ‘hp
        qcecoofyv puy vcfyo, hp qcecoofyv fduqc.” Ktyhqz bwc dfob pcj kfvo jc wfrc oteecooptddv myutzwb upp
        bwc zycfb xfauyhbv up bwc byuulo jc wfk uq bwc dhqc up euxxtqhefbhuq hq Pyfqec; fqk ocrcq-chzwbwo up
        bwc byuulo jc wfrc ocqb bu Pyfqec ohqec bwc mczhqqhqz up bwc jfy-bwfb ho bu ofv, fmutb 999,999 utb
        up 999,999 xcq-fyc ofpcdv mfei hq bwho eutqbyv. Ubwcyo fyc obhdd phzwbhqz jhbw bwc Pycqew, fqk
        phzwbhqz jhbw euqohkcyfmdc oteecoo hq bwchy duefd cqeutqbcyo fzfhqob bwc cqcxv. Jc wfrc fdou myutzwb
        mfei f zycfb xfoo up obuyco, yhpdco fqk xtqhbhuqo up fdd ihqko jwhew wfk mccq feetxtdfbck hq Pyfqec
        ktyhqz bwc dfob qhqc xuqbwo.
            
        Jc wfrc, bwcycpuyc, hq bwho Hodfqk bukfv f rcyv dfyzc fqk lujcyptd xhdhbfyv puyec. Bwho puyec
        euxlyhoco fdd uty mcob-byfhqck fqk uty phqcob byuulo, hqedtkhqz oeuyco up bwutofqko up bwuoc jwu
        wfrc fdycfkv xcfotyck bwchy stfdhbv fzfhqob bwc Zcyxfqo fqk putqk bwcxocdrco fb qu khofkrfqbfzc. Jc
        wfrc tqkcy fyxo fb bwc lycocqb bhxc hq bwho Hodfqk urcy f xhddhuq fqk f stfybcy xcq. Mcwhqk bwcoc jc
        wfrc bwc Duefd Kcpcqoc Rudtqbccyo, qtxmcyhqz wfdp f xhddhuq, uqdv f luybhuq up jwux, wujcrcy, fyc
        vcb fyxck jhbw yhpdco uy ubwcy phycfyxo. Jc wfrc hqeuyluyfbck hqbu uty Kcpcqoc Puyeco crcyv xfq puy
        jwux jc wfrc f jcfluq. Jc cglceb rcyv dfyzc fkkhbhuqo bu uty jcfluqo hq bwc qcfy ptbtyc, fqk hq
        lyclfyfbhuq puy bwho jc hqbcqk puybwjhbw bu efdd tl, kyhdd fqk byfhq ptybwcy dfyzc qtxmcyo. Bwuoc
        jwu fyc qub efddck tl, uy cdoc fyc cxlduvck ktyhqz bwc rfob mtohqcoo up xtqhbhuqo lyuktebhuq hq fdd
        hbo myfqewco-fqk bwchy yfxhphefbhuqo fyc hqqtxcyfmdc-jhdd ocyrc bwchy eutqbyv mcob mv ycxfhqhqz fb
        bwchy uykhqfyv juyi tqbhd bwcv ycechrc bwchy otxxuqo. Jc wfrc fdou urcy wcyc Kuxhqhuqo fyxhco. Bwc
        Efqfkhfqo wfk febtfddv dfqkck hq Pyfqec, mtb wfrc quj mccq ofpcdv jhbwkyfjq, xtew khoflluhqbck, mtb
        hq lcypceb uykcy, jhbw fdd bwchy fybhddcyv fqk csthlxcqb. Fqk bwcoc rcyv whzw-edfoo puyeco pyux bwc
        Kuxhqhuqo jhdd quj bfic lfyb hq bwc kcpcqoc up bwc Xubwcy Eutqbyv.
            
        Dcob bwc feeutqb jwhew H wfrc zhrcq up bwcoc dfyzc puyeco owutdk yfhoc bwc stcobhuq: Jwv khk bwcv
        qub bfic lfyb hq bwc zycfb mfbbdc hq Pyfqec? H xtob xfic hb edcfy bwfb, flfyb pyux bwc khrhohuqo
        byfhqhqz fqk uyzfqhnhqz fb wuxc, uqdv 99 khrhohuqo jcyc csthllck bu phzwb tluq f oefdc jwhew
        atobhphck bwchy mchqz ocqb fmyufk. Fqk bwho jfo ptddv tl bu bwc qtxmcy jwhew bwc Pycqew wfk mccq dck
        bu cglceb jutdk mc frfhdfmdc hq Pyfqec fb bwc qhqbw xuqbw up bwc jfy. Bwc ycob up uty puyeco fb wuxc
        wfrc f phzwbhqz rfdtc puy wuxc kcpcqoc jwhew jhdd, up eutyoc, obcfkhdv hqeycfoc crcyv jcci bwfb
        lfooco. Bwto, bwc hqrfohuq up Zycfb Myhbfhq jutdk fb bwho bhxc ycsthyc bwc byfqoluybfbhuq feyuoo bwc
        ocf up wuobhdc fyxhco uq f rcyv dfyzc oefdc, fqk fpbcy bwcv wfk mccq ou byfqoluybck bwcv jutdk wfrc
        bu mc euqbhqtfddv xfhqbfhqck jhbw fdd bwc xfooco up xtqhbhuqo fqk otlldhco jwhew fyc ycsthyck puy
        euqbhqtuto mfbbdc-fo euqbhqtuto mfbbdc hb jhdd otycdv mc.
            
        Wcyc ho jwcyc jc euxc bu bwc Qfrv-fqk fpbcy fdd, jc wfrc f Qfrv. Ouxc lculdc occx bu puyzcb bwfb jc
        wfrc f Qfrv. Jc xtob ycxhqk bwcx. Puy bwc dfob bwhybv vcfyo H wfrc mccq euqecyqck hq khoetoohuqo
        fmutb bwc luoohmhdhbhco up urcyocf hqrfohuq, fqk H buui bwc ycoluqohmhdhbv uq mcwfdp up bwc
        Fkxhyfdbv, fb bwc mczhqqhqz up bwc dfob jfy, up fddujhqz fdd ycztdfy byuulo bu mc ocqb utb up bwc
        eutqbyv. Bwfb jfo f rcyv ocyhuto obcl bu bfic, mceftoc uty Bcyyhbuyhfdo wfk uqdv atob mccq efddck tl
        fqk jcyc sthbc tqbyfhqck. Bwcycpuyc, bwho Hodfqk jfo puy ocrcyfd xuqbwo lfybhetdfydv kcqtkck up
        phzwbhqz byuulo. Bwc Fkxhyfdbv wfk euqphkcqec fb bwfb bhxc hq bwchy fmhdhbv bu lycrcqb f xfoo
        hqrfohuq crcq bwutzw fb bwfb bhxc bwc Zcyxfqo wfk f xfzqhphecqb mfbbdc pdccb hq bwc lyuluybhuq up 99
        bu 99, crcq bwutzw bwcv jcyc eflfmdc up phzwbhqz f zcqcyfd cqzfzcxcqb crcyv kfv fqk fqv kfv, jwcycfo
        quj bwcv wfrc uqdv f eutldc up wcfrv owhlo juybw olcfihqz up-bwc Oewfyqwuyob fqk bwc Zqchocqft. Jc
        fyc fdou budk bwfb bwc Hbfdhfq Qfrv ho bu euxc utb fqk zfhq ocf otlcyhuyhbv hq bwcoc jfbcyo. Hp bwcv
        ocyhutodv hqbcqk hb, H owfdd uqdv ofv bwfb jc owfdd mc kcdhzwbck bu uppcy Ohzquy Xtooudhqh f pycc
        fqk ofpcztfykck lfoofzc bwyutzw bwc Obyfhb up Zhmyfdbfy hq uykcy bwfb wc xfv ldfv bwc lfyb bu jwhew
        wc folhyco. Bwcyc ho f zcqcyfd etyhuohbv hq bwc Myhbhow Pdccb bu phqk utb jwcbwcy bwc Hbfdhfqo fyc
        tl bu bwc dcrcd bwcv jcyc fb hq bwc dfob jfy uy jwcbwcy bwcv wfrc pfddcq upp fb fdd.
            
        Bwcycpuyc, hb occxo bu xc bwfb fo pfy fo ocf-muyqc hqrfohuq uq f zycfb oefdc ho euqecyqck, jc fyc
        pfy xuyc eflfmdc up xccbhqz hb bukfv bwfq jc jcyc fb xfqv lcyhuko hq bwc dfob jfy fqk ktyhqz bwc
        cfydv xuqbwo up bwho jfy, mcpuyc uty ubwcy byuulo jcyc byfhqck, fqk jwhdc bwc M.C.P. wfk lyuecckck
        fmyufk. Quj, bwc Qfrv wfrc qcrcy lycbcqkck bu mc fmdc bu lycrcqb yfhko mv mukhco up 9,999 uy 99,999
        xcq pdtqz otkkcqdv feyuoo fqk bwyujq fowuyc fb ocrcyfd luhqbo uq bwc eufob ouxc kfyi qhzwb uy puzzv
        xuyqhqz. Bwc cpphefev up ocf lujcy, colcehfddv tqkcy xukcyq euqkhbhuqo, kclcqko tluq bwc hqrfkhqz
        puyec mchqz up dfyzc ohnc; Hb wfo bu mc up dfyzc ohnc, hq rhcj up uty xhdhbfyv obycqzbw, bu mc up
        fqv toc. Hp hb ho up dfyzc ohnc, bwcq bwc Qfrv wfrc ouxcbwhqz bwcv efq phqk fqk xccb fqk, fo hb
        jcyc, mhbc uq. Quj, jc xtob ycxcxmcy bwfb crcq phrc khrhohuqo, wujcrcy dhzwbdv csthllck, jutdk
        ycsthyc 999 bu 999 owhlo, fqk jhbw xukcyq fhy yceuqqfhoofqec fqk lwubuzyflwv hb jutdk qub mc cfov bu
        euddceb otew fq fyxfkf, xfyowfd hb, fqk euqkteb hb feyuoo bwc ocf jhbwutb fqv lujcyptd qfrfd puyeco
        bu coeuyb hb; fqk bwcyc jutdk mc rcyv zycfb luoohmhdhbhco, bu ltb hb xhdkdv, bwfb bwho fyxfkf jutdk
        mc hqbcyeclbck duqz mcpuyc hb ycfewck bwc eufob, fqk fdd bwc xcq kyujqck hq bwc ocf uy, fb bwc juyob
        mdujq bu lhceco jhbw bwchy csthlxcqb jwhdc bwcv jcyc byvhqz bu dfqk. Jc fdou wfrc f zycfb ovobcx up
        xhqcphcdko, ycecqbdv obyuqzdv ychqpuyeck, bwyutzw jwhew jc fduqc iquj bwc ewfqqcdo. Hp bwc cqcxv
        byhco bu ojccl lfoofzco bwyutzw bwcoc xhqcphcdko, hb jhdd mc bwc bfoi up bwc Qfrv bu kcobyuv bwc
        xhqc-ojcclcyo fqk fqv ubwcy puyeco cxlduvck bu lyubceb bwcx. Bwcyc owutdk mc qu khpphetdbv hq bwho,
        ujhqz bu uty zycfb otlcyhuyhbv fb ocf.
            
        Bwuoc fyc bwc ycztdfy, jcdd-bcobck, jcdd-lyurck fyztxcqbo uq jwhew jc wfrc ycdhck ktyhqz xfqv vcfyo
        hq lcfec fqk jfy. Mtb bwc stcobhuq ho jwcbwcy bwcyc fyc fqv qcj xcbwuko mv jwhew bwuoc oudhk
        footyfqeco efq mc ehyetxrcqbck. Ukk fo hb xfv occx, ouxc fbbcqbhuq wfo mccq zhrcq bu bwho mv bwc
        Fkxhyfdbv, jwuoc lyhxc ktbv fqk ycoluqohmhdhbv ho bu kcobyuv fqv dfyzc ocf-muyqc cglckhbhuq mcpuyc
        hb ycfewco, uy fb bwc xuxcqb jwcq hb ycfewco, bwcoc owuyco. Hb jutdk qub mc f zuuk bwhqz puy xc bu
        zu hqbu kcbfhdo up bwho. Hb xhzwb otzzcob hkcfo bu ubwcy lculdc jwhew bwcv wfrc qub bwutzwb up, fqk
        bwcv jutdk qub mc dhicdv bu zhrc to fqv up bwchy hkcfo hq cgewfqzc. Fdd H jhdd ofv ho bwfb tqbhyhqz
        rhzhdfqec fqk xhqk-ocfyewhqz xtob mc kcrubck bu bwc otmaceb, mceftoc bwc cqcxv ho eyfpbv fqk etqqhqz
        fqk ptdd up qurcd bycfewcyhco fqk obyfbfzcxo. Bwc Wutoc xfv mc footyck bwfb bwc tbxuob hqzcqthbv ho
        mchqz kholdfvck fqk hxfzhqfbhuq ho mchqz cruick pyux dfyzc qtxmcyo up euxlcbcqb upphecyo,
        jcdd-byfhqck hq bfebheo fqk bwuyutzwdv tl bu kfbc, bu xcfotyc fqk eutqbcyjuyi qurcd luoohmhdhbhco.
        Tqbhyhqz rhzhdfqec fqk tqbhyhqz ocfyewhqz up bwc xhqk ho mchqz, fqk xtob mc, kcrubck bu bwc otmaceb,
        mceftoc, ycxcxmcy, bwc cqcxv ho eyfpbv fqk bwcyc ho qu khybv byhei wc jhdd qub ku.
            
        Ouxc lculdc jhdd foi jwv, bwcq, jfo hb bwfb bwc Myhbhow Qfrv jfo qub fmdc bu lycrcqb bwc xurcxcqb up
        f dfyzc fyxv pyux Zcyxfqv hqbu Quyjfv feyuoo bwc Oifzcyyfi? Mtb bwc euqkhbhuqo hq bwc Ewfqqcd fqk hq
        bwc Quybw Ocf fyc hq qu jfv dhic bwuoc jwhew lycrfhd hq bwc Oifzcyyfi. Hq bwc Oifzcyyfi, mceftoc up
        bwc khobfqec, jc eutdk zhrc qu fhy otlluyb bu uty otypfec owhlo, fqk euqocstcqbdv, dvhqz fo jc khk
        eduoc bu bwc cqcxv’o xfhq fhy lujcy, jc jcyc euxlcddck bu toc uqdv uty otmxfyhqco. Jc eutdk qub
        cqpuyec bwc kcehohrc mdueifkc uy hqbcyytlbhuq jwhew ho luoohmdc pyux otypfec rcoocdo. Uty otmxfyhqco
        buui f wcfrv budd mtb eutdk qub, mv bwcxocdrco, lycrcqb bwc hqrfohuq up Quyjfv. Hq bwc Ewfqqcd fqk
        hq bwc Quybw Ocf, uq bwc ubwcy wfqk, uty otlcyhuy qfrfd otypfec puyeco, fhkck mv uty otmxfyhqco,
        jhdd ulcyfbc jhbw eduoc fqk cppcebhrc fhy foohobfqec.
            
        Bwho myhqzo xc, qfbtyfddv, bu bwc zycfb stcobhuq up hqrfohuq pyux bwc fhy, fqk up bwc hxlcqkhqz
        obytzzdc mcbjccq bwc Myhbhow fqk Zcyxfq Fhy Puyeco. Hb occxo sthbc edcfy bwfb qu hqrfohuq uq f oefdc
        mcvuqk bwc eflfehbv up uty dfqk puyeco bu eytow olcckhdv ho dhicdv bu bfic ldfec pyux bwc fhy tqbhd
        uty Fhy Puyec wfo mccq kcphqhbcdv urcylujcyck. Hq bwc xcfqbhxc, bwcyc xfv mc yfhko mv lfyfewtbc
        byuulo fqk fbbcxlbck kcoecqbo up fhymuyqc oudkhcyo. Jc owutdk mc fmdc bu zhrc bwuoc zcqbyv f jfyx
        yceclbhuq mubw hq bwc fhy fqk uq bwc zyutqk, hp bwcv ycfew hb hq fqv euqkhbhuq bu euqbhqtc bwc
        kholtbc. Mtb bwc zycfb stcobhuq ho: Efq jc mycfi Whbdcy’o fhy jcfluq? Quj, up eutyoc, hb ho f rcyv
        zycfb lhbv bwfb jc wfrc qub zub fq Fhy Puyec fb dcfob cstfd bu bwfb up bwc xuob lujcyptd cqcxv
        jhbwhq obyhihqz khobfqec up bwcoc owuyco. Mtb jc wfrc f rcyv lujcyptd Fhy Puyec jwhew wfo lyurck
        hbocdp pfy otlcyhuy hq stfdhbv, mubw hq xcq fqk hq xfqv bvlco up xfewhqc, bu jwfb jc wfrc xcb ou pfy
        hq bwc qtxcyuto fqk phcyec fhy mfbbdco jwhew wfrc mccq putzwb jhbw bwc Zcyxfqo. Hq Pyfqec, jwcyc jc
        jcyc fb f euqohkcyfmdc khofkrfqbfzc fqk duob xfqv xfewhqco uq bwc zyutqk jwcq bwcv jcyc obfqkhqz
        yutqk bwc fcyukyuxco, jc jcyc feetobuxck bu hqpdheb hq bwc fhy duooco up fo xtew fo bju fqk
        bju-fqk-f-wfdp bu uqc. Hq bwc phzwbhqz urcy Ktqihyi, jwhew jfo f ouyb up qu-xfq’o-dfqk, jc
        tqkutmbckdv mcfb bwc Zcyxfq Fhy Puyec, fqk zfhqck bwc xfobcyv up bwc duefd fhy, hqpdhebhqz wcyc f
        duoo up bwycc uy puty bu uqc kfv fpbcy kfv. Fqvuqc jwu duuio fb bwc lwubuzyflwo jwhew jcyc ltmdhowck
        f jcci uy ou fzu up bwc yc-cxmfyifbhuq, owujhqz bwc xfooco up byuulo foocxmdck uq bwc mcfew fqk
        puyxhqz fq hkcfd bfyzcb puy wutyo fb f bhxc, xtob ycfdhnc bwfb bwho yc-cxmfyifbhuq jutdk qub wfrc
        mccq luoohmdc tqdcoo bwc cqcxv wfk ycohzqck fdd wulc up yceurcyhqz fhy otlcyhuyhbv fb bwfb bhxc fqk
        fb bwfb ldfec.
            
        Hq bwc kcpcqoc up bwho Hodfqk bwc fkrfqbfzco bu bwc kcpcqkcyo jhdd mc xtew zycfbcy bwfq bwcv jcyc hq
        bwc phzwbhqz fyutqk Ktqihyi. Jc wulc bu hxlyurc uq bwc yfbc up bwycc uy puty bu uqc jwhew jfo
        ycfdhnck fb Ktqihyi; fqk hq fkkhbhuq fdd uty hqatyck xfewhqco fqk bwchy eycjo jwhew zcb kujq
        ofpcdv-fqk, otylyhohqzdv, f rcyv zycfb xfqv hqatyck xfewhqco fqk xcq ku zcb kujq ofpcdv hq xukcyq
        fhy phzwbhqz-fdd up bwcoc jhdd pfdd, hq fq fbbfei tluq bwcoc Hodfqko, uq pyhcqkdv. ouhd fqk dhrc bu
        phzwb fqubwcy kfv; jwcycfo fdd bwc hqatyck cqcxv xfewhqco fqk bwchy euxldcxcqbo jhdd mc bubfd duooco
        fo pfy fo bwc jfy ho euqecyqck.
            
        Ktyhqz bwc zycfb mfbbdc hq Pyfqec, jc zfrc rcyv lujcyptd fqk euqbhqtuto fhk bu. bwc Pycqew Fyxv,
        mubw mv phzwbcyo fqk muxmcyo; mtb hq olhbc up crcyv ihqk up lycootyc jc qcrcy jutdk fdduj bwc cqbhyc
        xcbyuludhbfq phzwbcy obycqzbw up bwc Fhy Puyec bu mc euqotxck. Bwho kcehohuq jfo lfhqptd, mtb hb jfo
        fdou yhzwb, mceftoc bwc puybtqco up bwc mfbbdc hq Pyfqec eutdk qub wfrc mccq kcehohrcdv fppcebck
        crcq hp jc wfk bwyujq hq uty cqbhyc phzwbcy puyec. Bwfb mfbbdc jfo duob mv bwc tqpuybtqfbc
        obyfbczhefd ulcqhqz, mv bwc cgbyfuykhqfyv fqk tqpuyoccq lujcy up bwc fyxuyck eudtxqo, fqk mv bwc
        zycfb lycluqkcyfqec up bwc Zcyxfq Fyxv hq qtxmcyo. Uty phzwbcy Fhy Puyec xhzwb cfohdv wfrc mccq
        cgwftobck fo f xcyc feehkcqb hq bwfb zycfb obytzzdc, fqk bwcq jc owutdk wfrc putqk utyocdrco fb bwc
        lycocqb bhxc hq f rcyv ocyhuto ldhzwb. Mtb fo hb ho, H fx wfllv bu hqpuyx bwc Wutoc bwfb uty phzwbcy
        obycqzbw ho obyuqzcy fb bwc lycocqb bhxc ycdfbhrcdv bu bwc Zcyxfqo, jwu wfrc otppcyck bcyyhmdc
        duooco, bwfq hb wfo crcy mccq; fqk euqocstcqbdv jc mcdhcrc utyocdrco luoocoock up bwc eflfehbv bu
        euqbhqtc bwc jfy hq bwc fhy tqkcy mcbbcy euqkhbhuqo bwfq jc wfrc crcy cglcyhcqeck mcpuyc. H duui
        puyjfyk euqphkcqbdv bu bwc cglduhbo up uty phzwbcy lhdubo-bwcoc oldcqkhk xcq, bwho myhddhfqb
        vutbw-jwu jhdd wfrc bwc zduyv up ofrhqz bwchy qfbhrc dfqk, bwchy hodfqk wuxc, fqk fdd bwcv durc,
        pyux bwc xuob kcfkdv up fdd fbbfeio.
            
        Bwcyc ycxfhqo, up eutyoc, bwc kfqzcy up muxmhqz fbbfeio, jwhew jhdd ecybfhqdv mc xfkc rcyv ouuq tluq
        to mv bwc muxmcy puyeco up bwc cqcxv. Hb ho bytc bwfb bwc Zcyxfq muxmcy puyec ho otlcyhuy hq qtxmcyo
        bu utyo; mtb jc wfrc f rcyv dfyzc muxmcy puyec fdou, jwhew jc owfdd toc bu obyhic fb xhdhbfyv
        bfyzcbo hq Zcyxfqv jhbwutb hqbcyxhoohuq. H ku qub fb fdd tqkcyyfbc bwc ocrcyhbv up bwc uykcfd jwhew
        dhco mcpuyc to; mtb H mcdhcrc uty eutqbyvxcq jhdd owuj bwcxocdrco eflfmdc up obfqkhqz tl bu hb, dhic
        bwc myfrc xcq up Mfyecduqf, fqk jhdd mc fmdc bu obfqk tl bu hb, fqk efyyv uq hq olhbc up hb, fb
        dcfob fo jcdd fo fqv ubwcy lculdc hq bwc juydk. Xtew jhdd kclcqk tluq bwho; crcyv xfq fqk crcyv
        juxfq jhdd wfrc bwc ewfqec bu owuj bwc phqcob stfdhbhco up bwchy yfec, fqk ycqkcy bwc whzwcob
        ocyrhec bu bwchy eftoc. Puy fdd up to, fb bwho bhxc, jwfbcrcy uty olwcyc, uty obfbhuq, uty
        ueetlfbhuq uy uty ktbhco, hb jhdd mc f wcdl bu ycxcxmcy bwc pfxuto dhqco: Wc qubwhqz euxxuq khk uy
        xcfq, Tluq bwfb xcxuyfmdc oecqc.
            
        H wfrc bwutzwb hb yhzwb tluq bwho ueefohuq bu zhrc bwc Wutoc fqk bwc eutqbyv ouxc hqkhefbhuq up bwc
        oudhk, lyfebhefd zyutqko tluq jwhew jc mfoc uty hqpdcghmdc ycoudrc bu euqbhqtc bwc jfy. Bwcyc fyc f
        zuuk xfqv lculdc jwu ofv, “Qcrcy xhqk. Jhq uy duoc, ohqi uy ojhx, mcbbcy khc bwfq otmxhb bu
        bvyfqqv-fqk otew f bvyfqqv.” Fqk H ku qub khoouehfbc xvocdp pyux bwcx. Mtb H efq footyc bwcx bwfb
        uty lyupcoohuqfd fkrhocyo up bwc bwycc Ocyrheco tqhbckdv fkrhoc bwfb jc owutdk efyyv uq bwc jfy, fqk
        bwfb bwcyc fyc zuuk fqk ycfouqfmdc wulco up phqfd rhebuyv. Jc wfrc ptddv hqpuyxck fqk euqotdbck fdd
        bwc ocdp-zurcyqhqz Kuxhqhuqo, bwcoc zycfb euxxtqhbhco pfy mcvuqk bwc uecfqo jwu wfrc mccq mthdb tl
        uq uty dfjo fqk uq uty ehrhdhnfbhuq, fqk jwu fyc fmoudtbcdv pycc bu ewuuoc bwchy eutyoc, mtb fyc
        fmoudtbcdv kcrubck bu bwc fqehcqb Xubwcydfqk, fqk jwu pccd bwcxocdrco hqolhyck mv bwc ofxc cxubhuqo
        jwhew dcfk xc bu obfic uty fdd tluq ktbv fqk wuquy. Jc wfrc ptddv euqotdbck bwcx, fqk H wfrc
        ycechrck pyux bwchy Lyhxc Xhqhobcyo, Xy. Xfeicqnhc Ihqz up Efqfkf, Xy. Xcqnhco up Ftobyfdhf, Xy.
        Pyfocy up Qcj Ncfdfqk, fqk Zcqcyfd Oxtbo up Outbw Fpyhef-bwfb juqkcyptd xfq, jhbw who hxxcqoc
        lyuputqk xhqk, fqk who cvc jfbewhqz pyux f khobfqec bwc jwudc lfquyfxf up Ctyulcfq fppfhyo-H wfrc
        ycechrck pyux fdd bwcoc cxhqcqb xcq, jwu fdd wfrc Zurcyqxcqbo mcwhqk bwcx cdcebck uq jhkc
        pyfqewhoco, jwu fyc fdd bwcyc mceftoc bwcv yclycocqb bwc jhdd up bwchy lculdc, xcoofzco eutewck hq
        bwc xuob xurhqz bcyxo hq jwhew bwcv cqkuyoc uty kcehohuq bu phzwb uq, fqk kcedfyc bwcxocdrco ycfkv
        bu owfyc uty puybtqco fqk bu lcyocrcyc bu bwc cqk. Bwfb ho jwfb jc fyc zuhqz bu ku.
            
        Jc xfv quj foi utyocdrco: Hq jwfb jfv wfo uty luohbhuq juyocqck ohqec bwc mczhqqhqz up bwc jfy? Hb
        wfo juyocqck mv bwc pfeb bwfb bwc Zcyxfqo wfrc euqstcyck f dfyzc lfyb up bwc eufob dhqc up Jcobcyq
        Ctyulc, fqk xfqv oxfdd eutqbyhco wfrc mccq urcyytq mv bwcx. Bwho fzzyfrfbco bwc luoohmhdhbhco up fhy
        fbbfei fqk fkko bu uty qfrfd lycueetlfbhuqo. Hb hq qu jfv khxhqhowco, mtb uq bwc euqbyfyv kcphqhbcdv
        hqeycfoco, bwc lujcy up uty duqz-khobfqec mdueifkc. Ohxhdfydv, bwc cqbyfqec up Hbfdv hqbu bwc jfy
        hqeycfoco bwc lujcy up uty duqz-khobfqec mdueifkc. Jc wfrc obullck bwc juyob dcfi mv bwfb. Jc ku qub
        iquj jwcbwcy xhdhbfyv ycohobfqec jhdd euxc bu fq cqk hq Pyfqec uy qub, mtb owutdk hb ku ou, bwcq up
        eutyoc bwc Zcyxfqo jhdd mc fmdc bu euqecqbyfbc bwchy puyeco, mubw xhdhbfyv fqk hqktobyhfd, tluq to.
        Mtb puy bwc ycfouqo H wfrc zhrcq bu bwc Wutoc bwcoc jhdd qub mc putqk ou cfov bu flldv. Hp hqrfohuq
        wfo mceuxc xuyc hxxhqcqb, fo qu kutmb hb wfo, jc, mchqz ycdhcrck pyux bwc bfoi up xfhqbfhqhqz f
        dfyzc fyxv hq Pyfqec, wfrc pfy dfyzcy fqk xuyc cpphehcqb puyeco bu xccb hb.
            
        Hp Whbdcy efq myhqz tqkcy who kcolubhe euqbyud bwc hqktobyhco up bwc eutqbyhco wc wfo euqstcyck,
        bwho jhdd fkk zycfbdv bu who fdycfkv rfob fyxfxcqb utbltb. Uq bwc ubwcy wfqk, bwho jhdd qub wfllcq
        hxxckhfbcdv, fqk jc fyc quj footyck up hxxcqoc, euqbhqtuto fqk hqeycfohqz otlluyb hq otlldhco fqk
        xtqhbhuqo up fdd ihqko pyux bwc Tqhbck Obfbco; fqk colcehfddv up fcyuldfqco fqk lhdubo pyux bwc
        Kuxhqhuqo fqk feyuoo bwc uecfqo euxhqz pyux yczhuqo jwhew fyc mcvuqk bwc ycfew up cqcxv muxmcyo.
            
        H ku qub occ wuj fqv up bwcoc pfebuyo efq ulcyfbc bu uty kcbyhxcqb uq mfdfqec mcpuyc bwc jhqbcy
        euxco; fqk bwc jhqbcy jhdd hxluoc f obyfhq tluq bwc Qfnh yczhxc, jhbw fdxuob fdd Ctyulc jyhbwhqz fqk
        obfyrhqz tqkcy hbo eytcd wccd, jwhew, puy fdd bwchy ytbwdcooqcoo, jhdd ytq bwcx rcyv wfyk. Jc xtob
        qub puyzcb bwfb pyux bwc xuxcqb jwcq jc kcedfyck jfy uq bwc 9yk Oclbcxmcy hb jfo fdjfvo luoohmdc puy
        Zcyxfqv bu btyq fdd wcy Fhy Puyec tluq bwho eutqbyv, buzcbwcy jhbw fqv ubwcy kcrheco up hqrfohuq owc
        xhzwb euqechrc, fqk bwfb Pyfqec eutdk wfrc kuqc dhbbdc uy qubwhqz bu lycrcqb wcy kuhqz ou. Jc wfrc,
        bwcycpuyc, dhrck tqkcy bwho kfqzcy, hq lyhqehldc fqk hq f odhzwbdv xukhphck puyx, ktyhqz fdd bwcoc
        x9qbwo. Hq bwc xcfqjwhdc, wujcrcy, jc wfrc cquyxutodv hxlyurck uty xcbwuko up kcpcqoc, fqk jc wfrc
        dcfyqck jwfb jc wfk qu yhzwb bu footxc fb bwc mczhqqhqz, qfxcdv, bwfb bwc hqkhrhktfd fhyeyfpb fqk
        bwc hqkhrhktfd Myhbhow lhdub wfrc f otyc fqk kcphqhbc otlcyhuyhbv. Bwcycpuyc, hq efobhqz tl bwho
        kycfk mfdfqecowccb fqk euqbcxldfbhqz uty kfqzcyo jhbw f khohddtohuqck cvc, H occ zycfb ycfouq puy
        hqbcqoc rhzhdfqec fqk cgcybhuq, mtb quqc jwfbcrcy puy lfqhe uy kcolfhy.
            
        Ktyhqz bwc phyob puty vcfyo up bwc dfob jfy bwc Fddhco cglcyhcqeck qubwhqz mtb khofobcy fqk
        khoflluhqbxcqb. Bwfb jfo uty euqobfqb pcfy: uqc mduj fpbcy fqubwcy, bcyyhmdc duooco, pyhzwbptd
        kfqzcyo. Crcyvbwhqz xhoefyyhck. Fqk vcb fb bwc cqk up bwuoc puty vcfyo bwc xuyfdc up bwc Fddhco jfo
        whzwcy bwfq bwfb up bwc Zcyxfqo, jwu wfk xurck pyux uqc fzzycoohrc byhtxlw bu fqubwcy, fqk jwu obuuk
        crcyvjwcyc byhtxlwfqb hqrfkcyo up bwc dfqko hqbu jwhew bwcv wfk myuicq. Ktyhqz bwfb jfy jc
        yclcfbckdv foick utyocdrco bwc stcobhuq: Wuj fyc jc zuhqz bu jhq? fqk qu uqc jfo fmdc crcy bu fqojcy
        hb jhbw xtew lycehohuq, tqbhd fb bwc cqk, sthbc otkkcqdv, sthbc tqcglcebckdv, uty bcyyhmdc puc
        euddflock mcpuyc to, fqk jc jcyc ou zdtbbck jhbw rhebuyv bwfb hq uty puddv jc bwycj hb fjfv.
            
        Jc ku qub vcb iquj jwfb jhdd wfllcq hq Pyfqec uy jwcbwcy bwc Pycqew ycohobfqec jhdd mc lyuduqzck,
        mubw hq Pyfqec fqk hq bwc Pycqew Cxlhyc urcyocfo. Bwc Pycqew Zurcyqxcqb jhdd mc bwyujhqz fjfv zycfb
        ulluybtqhbhco fqk efobhqz fkyhpb bwchy ptbtyc hp bwcv ku qub euqbhqtc bwc jfy hq feeuykfqec jhbw
        bwchy Bycfbv umdhzfbhuqo, pyux jwhew jc wfrc qub pcdb fmdc bu ycdcfoc bwcx. Bwc Wutoc jhdd wfrc ycfk
        bwc whobuyhe kcedfyfbhuq hq jwhew, fb bwc kcohyc up xfqv Pycqewxcq-fqk up uty ujq wcfybo-jc wfrc
        lyuedfhxck uty jhddhqzqcoo fb bwc kfyicob wuty hq Pycqew whobuyv bu euqedtkc f tqhuq up euxxuq
        ehbhncqowhl hq bwho obytzzdc. Wujcrcy xfbbcyo xfv zu hq Pyfqec uy jhbw bwc Pycqew Zurcyqxcqb, uy
        ubwcy Pycqew Zurcyqxcqbo, jc hq bwho Hodfqk fqk hq bwc Myhbhow Cxlhyc jhdd qcrcy duoc uty ocqoc up
        euxyfkcowhl jhbw bwc Pycqew lculdc. Hp jc fyc quj efddck tluq bu cqktyc jwfb bwcv wfrc mccq
        otppcyhqz, jc owfdd cxtdfbc bwchy eutyfzc, fqk hp phqfd rhebuyv ycjfyko uty buhdo bwcv owfdd owfyc
        bwc zfhqo, fvc, fqk pycckux owfdd mc ycobuyck bu fdd. Jc fmfbc qubwhqz up uty atob kcxfqko; qub uqc
        aub uy bhbbdc ku jc yceckc. Encewo, Ludco, Quyjczhfqo, Ktbew, Mcdzhfqo wfrc auhqck bwchy eftoco bu
        uty ujq. Fdd bwcoc owfdd mc ycobuyck.
            
        Jwfb Zcqcyfd Jcvzfqk efddck bwc Mfbbdc up Pyfqec ho urcy. H cglceb bwfb bwc Mfbbdc up Myhbfhq ho
        fmutb bu mczhq. Tluq bwho mfbbdc kclcqko bwc otyrhrfd up Ewyhobhfq ehrhdhnfbhuq. Tluq hb kclcqko uty
        ujq Myhbhow dhpc, fqk bwc duqz euqbhqthbv up uty hqobhbtbhuqo fqk uty Cxlhyc. Bwc jwudc ptyv fqk
        xhzwb up bwc cqcxv xtob rcyv ouuq mc btyqck uq to. Whbdcy iqujo bwfb wc jhdd wfrc bu mycfi to hq
        bwho Hodfqk uy duoc bwc jfy. Hp jc efq obfqk tl bu whx, fdd Ctyulc xfv mc pycc fqk bwc dhpc up bwc
        juydk xfv xurc puyjfyk hqbu myufk, otqdhb tldfqko. Mtb hp jc pfhd, bwcq bwc jwudc juydk, hqedtkhqz
        bwc Tqhbck Obfbco, hqedtkhqz fdd bwfb jc wfrc iqujq fqk efyck puy, jhdd ohqi hqbu bwc fmvoo up f qcj
        Kfyi Fzc xfkc xuyc ohqhobcy, fqk lcywflo xuyc lyubyfebck, mv bwc dhzwbo up lcyrcybck oehcqec. Dcb to
        bwcycpuyc myfec utyocdrco bu uty ktbhco, fqk ou mcfy utyocdrco bwfb, hp bwc Myhbhow Cxlhyc fqk hbo
        Euxxuqjcfdbw dfob puy f bwutofqk vcfyo, xcq jhdd obhdd ofv, “Bwho jfo bwchy phqcob wuty.”
        """;
    var plain = decrypt(cipher, 5);
    assertEquals("Churchill", Dinglemouse.who(5, cipher));
    assertEquals(cipher.length(), plain.length());
  }

  private String decrypt(String cipher, int sid) {
    var plain = new StringBuilder();
    for (char c : cipher.toCharArray()) {
      if (Character.isLetter(c)) {
        int index = charmap.get(sid).indexOf(Character.toLowerCase(c));
        char origin = charmap.get(0).get(index);
        c = Character.isUpperCase(c) ? Character.toUpperCase(origin) : origin;
      }
      plain.append(c);
    }
    return plain.toString();
  }
}