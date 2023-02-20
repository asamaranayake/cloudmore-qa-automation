package com.cloudmore.testSteps.api;


import org.testng.annotations.Test;

import java.util.Map;
import static java.util.stream.Collectors.toMap;

import io.restassured.http.Header;
import io.restassured.response.Response;

import org.cornutum.tcases.openapi.test.ResponseValidator;

import org.hamcrest.Matcher;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ComCloudmoreTest {

    private ResponseValidator responseValidator = new ResponseValidator( getClass());

    @Test
    public void postUser_BodyDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{}")
            .when()
                .request( "POST", "/user")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertyCount_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"uA[Pv\\\\7&$FbD{($j/HBlL^uL^`-'k8)D0OwG,/YH4MXZ2da)Aq@qU_0>@sY3gH6T@*4krsc~ \",\"lastName\":\"?M=7]Q%YIqBr{1nZpIx/\\\"#fQYn3m88Z/|w;ogg\\\\B2x0_9Y8\\\\\",\"password\":\"A jdi6kk<^%x'Hz$F61|s)'Q^v0!/+yg&\\\\wYO{X\\\\PkDN!yoO.{m\\\"Dh$o7CgCY]p>cei'?MLm[]%y~~e$!.EvXo(@@ym1q!LMk7ELphiHj^,9cO@6]6^pij:Ynk`5d0$i%;)u}cz_br2|3GfTH.@~/OK\",\"userStatus\":-436017823,\"phone\":\"Y}]FP]g~jvr6%GvfR[NBbZ@F:gdqDK>o']\",\"id\":-1721450638539041162,\"email\":\"hR]?{x,7o?t]\\\"%e6Tr4Z6Tl@?TjUi=8o)`-s)#E[{ t<SlyS{+#0LjAOhc5bv))<[;yBSpyL~yOjy-Ip5x97PW(xx`f+H4V2Q=(yB*G;L>jT!;3f6BZE_!7%WP>1.ZLTL [rJU</DAEkK8I.9sN 6>?+&;vouuAvjS\",\"username\":\"F$'q<1\\\"7*}n:|Dp-Bs63:$GsAc0Bn&#]HnGVS{\",\"sqf\":-109,\"kjh\":\"ag'4C8c,\"}")
            .when()
                .request( "POST", "/user")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"id\":0}")
            .when()
                .request( "POST", "/user")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":2785190951306067958,\"email\":\"\",\"username\":\"\",\"oszacydsuocibu\":[],\"xcaklfc\":1012.9}")
            .when()
                .request( "POST", "/user")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesUserStatusValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"userStatus\":716185269}")
            .when()
                .request( "POST", "/user")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
            .when()
                .request( "POST", "/user")
            .then()
                // Body.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyMediaType_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/x-www-form-urlencoded")
                .formParam( "integer", "310")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.Media-Type=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "null")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

      //  responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "691")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"1y#toCCIvrrqN~2: 2-x#yz`hjj0 /Oy;@uM\\\\H[1'P-+\\\\^qz?W>~gXIN|$r~4oC.[ju)qtD8,sT:LAqt\\\\3?pp;eZ$hwpfg,Xz1IDHsx8P uw&p/-@*Zhv}&;p>:p/?IVzC;r[TX=zu%l*^;Ckqx[bf8J}7*NW'd4+)qz.BM1F@P*se__n_SFh-F0N0]42(1o|lS}!<5/o+84va\\\"S>=!tu'`8\",\"lastName\":\"}^na#--a&K2UE<z]g}VvG?3l)0YJn~#H9H.K'Ki'HijKz=?(p(-|+:@ZPO~-[n1T|WhA;{ex4py F)3\\\"qq/gwUs](h$:B5&YeIu2&h$\",\"password\":\"nVo3f6o(I>4L!sK_p=a/f<jieBD!k;0>inU<G skGPcoxPgLv:'qfi!4\\\\[vsqWjE(+Br}RP<\\\"7v2hPUJ^RM?G2AP?-\\\"ee5MSz%<U7(:)y7w.BZu#Df{p'fPB}oaC;>Qi;AXE$y+\",\"phone\":\"h{HbD(KJ/|rptV%;QqbcIC_mVD>TWD&#unipUTIP2BulPQq;<@6Gn()Z|]_wHx2,0b'@[Ce`VY/v>jKC&$W<{y@C<2[|s$$fl6+RNv3 H<jM!N`K6i1G4(;zKL?KC|Ug#EAl#(MTR}:<OS?w:B4yGU;Lg$]EnvLm(bM=? &]6Dmtm?DJcE&PL~8[^RL%<^kz|\\\\\\\"TDpPNe$%/\\\"WjP x3c-qe#DYL}]'EeOsza/u3b|?jLn54\",\"id\":null,\"email\":\"!Sq\\\\.nKCt{;)+S2)|mk.:lA7jrE\\\"q85mTK$hJx4Dvp1}<yW*MPw~+d)7B~{M:d8UD/S-bhcr6|?~yc]LMB_)9)4+=19~Ze6I<y<J0GMGu=On'@4R3z.dT6\\\"a&&0M F{!`~IU;Ud:rD3kz(3PAV7NZ*I_RS?Ch'(C%A *.8feV%M=D,B'H@!cbO\\\\wFd$R\",\"username\":\"=dvFM-QdkRdm*~Sp[QuVAXN-0f@\\\\C?JM%y,*m4m>I:9f4m$yb/qwo7j62%?Q|D#vzh\\\\qV5~X{FNstSHm}d\",\"shqfiudme\":-233,\"hqfwopc\":\"$ LI .k-\",\"wsej\":true}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"Ut\\\\?jGM6E=\",\"lastName\":\"l}qv}%#nx;EKg0MEKGF(IB{Zb17u?j}Nv~ESZbc:;))<39@tljlt}@k)F{4]gc%YzN\\\"cs-tf-3V8gtL@|/PbOUsix=E gY1/EO\\\"\\\"yjtX;)Dk97m1P:@b,2%.JUR (UYZ1uQX@]_C}$#8Zc_G-jp+ $f[UCvX6 /O'\\\\WrEVc`}aj8$'\",\"password\":\"dW$Vyq/Z}PMzPR.\\\\NTa^I[2K(ywlq ^Q^YCHP*kAZhbP(s_.$hbcyXUFqsgi!lqYO[ia)\",\"phone\":\"M#M(C}(e9qc~JuYfJSQp;(,K~i~u(,M7+QKl#3fKBbj1r-:WVIGiyIKbX\\\"V:ho?*W;`lVmAunOJu$|K#\\\\ .8PzazT|^=z~el|X'Udy2Tm,_Gd2s)_c^nawlH+lV-5DN|Y!~{bqSgGo73^\\\"YD^6c39gcIa~._V#P~ax)*`.5MYxii`3?Ur{ZQpp%PBC9=6R|:Ys0t}#I=1?`NF4j*4mK&EG4 6m|SO+b!r`;_\",\"id\":true,\"email\":\"qtWc9ztT=*Jc^} D8A\\\\vSRP\\\"4Ke@ fAo%G|McXf@jbKU| kBwlz[1[44uMXk]^EBK&2!*M0kS%(ziUj5\",\"username\":\"{T~L@xG#vvGqN:%+xqH\\\\<e'fAJ)t\\\"};\\\\d#C`U8ez)lO217@S0OnO!W{e9Xf[i[yHdo*erf1jqK.t?EE&gSR)Av\",\"tjvnvochxc\":true}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesUsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"[]?RC'WcTo|7$qm&`\\\\</7`A91PTnP\\\\x,D[KxmE[!|rh~PT;LP'/x\\\"&w \\\\zd_Xj:].Fo11<Q{Ct$Xr]>kaIz2}>DmuAS/nk'gXF`lwI+^XB7H;#K7E_uiHVM+Fsr_hwQf]OC@^44mEA'[K7;h\\\"PF3Xe;W|0`@[o dYQustnS-a+rTQNI5hvt#wmk3(.\\\"P06*~nwrx@PY34Us~QAZXwARMT=(\",\"lastName\":\"P$cts\\\\K!r>niqx,)U@7K9+|-}m2s57!\",\"password\":\"lG9:ziPK23k `fqZ_/tcHNRZh`Q{x=SeDWXgkuRbU0W'}FG7\",\"phone\":\"[o v~\\\"Emu\\\"[CxLEIh!V}a$:Qpu^I!ZOq|Q7odUk-ZMV')\\\"?y[f[\\\">k'\\\"~IzTK/7,\\\"rWOvt:3W7P9?X|7c~AWhz5{Ag)}LT@3@uW(\",\"id\":-566785034494893304,\"email\":\"9Cp5B>IO4/\\\\?CVvafr\\\"B+E6.Q{?<7)[(o>_.:gV\\\"*K&JIeav|8k@(B.S}A])K4+&U|SnHgUZ%=jYD!2p(BC/<Ah]Ai9CAXd}:`|oAW^??OS$pKY{&]CZQ~w'hx1}g!yVOGkl7tMv!%d%`2Z\\\"\\\"Hm!4ZT!u%>lc8|K#vUW$:BYPCPZy_`S-OHO[QCaJG}X/:z4hlfX0D9leR;<~y!!63QfvJtm#nW5[xUk0H!_524\",\"username\":null,\"cvfxchhisgtqql\":{},\"gqjsvebom\":{\"sps\":\"R\"},\"wrtqwxzamdwkdv\":-805.8}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesUsernameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"!y#BHVwN}D9aD]-P;i,!{/\\\\S.XNbgcu>E--D8`uM\\\\>,$.`aZN2'$2hReF(A*Ags[mzl$.]VLC)(Ke*=[QQ^ phlbUi2\\\\Wsf\\\"1vvJE%KNUEpbi-P<qKV}Q(!0+X6zAmD\\\\\\\",phI&q^hC_Be\\\\e-1f./`MWs>lcPOg6ic;bPqxFzL,QHL.(#Po\",\"lastName\":\"f4N{1f*DRMM<' I`r^0`WRX0\\\"@j@bK'?u!;6}'*mYkc``H7K8Q^W~n5c4'4A&)]$D/TFni1>9*()KfGBeWAkGV<rg(nbrQfx4`{S6;zxzGw7c9^3x)\",\"password\":\"veOrQa5~Ui3RX!R3Ho#m5-n&<dUG^cZDpC\\\"5J7O5(gHF3S0Po/g*xl:7bp`Qa0y/p7FH!Htfh.f}HYZ8_-reDt4WMLnSKpkFThAq%l3k@s%NLKm`Wp q|Zak+7fj/Z1rvk,,k* DxLu_3HSJ;OfG5'i--h7@EHL\\\\8})!\\\".aaE%UB*%g-icBky4>G|qdkI=\\\"gjS<J+@X/&78J<\",\"phone\":\"Fge9hw,s%]MkjL!:pfVyrzHJ! b$W>M8Y75}fg]6ya*|Zv8hTa#pI{d8eEkW;,yXE~Dx{9%Rz_WAe`_a9/S_DDJE#81p;4RbpzG)Lkpd\",\"id\":-762719398222624970,\"email\":\"]@G^#=`rirE]r@\\\\o>j2L'_Df/.j~oUwn{(\\\".62%Y1w3=nSV0c(g:G+v.bChv,|zyOTI2*jKJp<(O0Vh=2 ihQfuQed,myp|VZzG<9n}HO/h!D%Y|+:yl:#m(H&s>@1gMeYZMID4~!|F` ~uK9Q%(|~8P=6&FA$Dob`7$)lE6?iB*LP:+7-h/4r;fWc\",\"username\":{\"guvwetqnyzrjqqcf\":836.5,\"lvinxiburqmloy\":true},\"xwjrlnlmxerhd\":true}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.username.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesFirstNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":null,\"lastName\":\"'z*0)TS5`C_8%\\\"\\\\dD*;Fpf+FD/j$vQ\\\\[w+fP19D[@af\\\"*7oU:n8](|M\\\\EyXNRX=z;F<iNbSIt.vE%93M0s# )t})zVB8@nlH+HSMxeVF!\\\\`&o`JRl;S}5\",\"password\":\"YFT[5SMnHD:<Yi%!_~ug.4;#u8O6rqvKs[5@1tcX&97yO~5}Ux!AVi?&pfied5WDJSxJvy[Vm\\\\>*t7kj$\\\"fJlTZg*:'M{Pey7g7q+{C5jW''`W,'ELQ_[yB'Pa_+U\",\"phone\":\",L!*dpBRjC`^$;\\\\Qyzx/W{tfgaXV,fF$O]*q2'],7o :f9%u#fpnKp\\\\-7X,gEPt~v5o0w&Zo=y5CbN<{F\\\\6i!ln}\\\\:~#;q)S~K9^k?+s9Bbc\\\"&G75[3T0N9[66\\\\!Qdy1cA\",\"id\":-810221858710126260,\"email\":\"Ll7,y7P6wT7T'-Z6~}3?].1<%g]yHR>tLv=KOlI%Ed%7I6BySu;,^l'=re7]@\\\\>czkN7tP6o>(gmk+NqllZti)fM4<Us.MR6~>k$&xY\\\"&PkzV]_#O *CXX<f\\\\l(@JO:9]EB{=fRqG.<?|xMN\",\"username\":\"j7n2shwx?&jq2,AyG4&L`/U[dw4cKi~{iJwGI}h*}K~fY}ko>h64U'OM'$ .?&)q8%EosoPU(~R.\",\"tvceqhjqwx\":{\"xodbnrh\":498.4,\"ckzvzfu\":true,\"aisj\":35},\"qyojunuhern\":true,\"junpdygnyfghvkw\":[\"&ah#qla\",\"-x21\",\"r$X9OP'X\"]}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.firstName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesFirstNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":-897,\"lastName\":\",/H^/~0i,(*[:Oxk8TMArCeFwuIm.;p$4MDE|7z\\\"shb,\\\"0]EI`kaxIcE.fXsD`@jqUO?D  OXG-sv)`]XzB]L(=F~%lizmx]\\\\p';`l~HfBXi3*.T2 <WcZoWj+z<DaV J\\\\y40|NQd|1Jm!`:>Jl9x|9~L):gh2zohn-[]L2G,@:b|HR*~tAF-j%ri>7=.|*66h-b}n:9&4f^z$iLkI``\\\\KQ+g|Q_h/i*/FvwaF[dK.=xUOC #zv- z,sED< Dp\",\"password\":\"M'0I7J;>x2v\\\"xQQ2ul`.#R7l{Tfn+s1Nl3m# ]c/B>;Z{lR4Ndp_hG h[oM>at/ FQ+5G{/24*|\",\"phone\":\"Edr6nm`)Mb\\\\Ny+u&yT-TP,M8WmzX#wp$m\\\";,Vd-Qc1TFbRUsMD/dI48J,zO9HADd/apXt05BbQy8~K/b2Cb]U|F|YwovHsRki_T#qx&Fiq[g'v[^c}H7=JH@8b>hpnYGV`1VTk\",\"id\":-2529475902706920722,\"email\":\"GLG&q;7mRI7#Q]ZS)5u){\\\\;wL^c]-$**R}~l#pv4M6%e\\\"9>;;F96BsTzGa(*bNANd>#sXShJw\\\\xh^6h8@5w9`Y(BY=G*Rnxe=GqD1\",\"username\":\"f0<vWOHw2UmCAm'3LI$;&pHPp5ylu}*krR\\\"$To[zkV#s}*;ND.URgyaT[ bI:vg[$sBY:X.gfBn!Z+G2T&gI.W|\\\\Wn!z~$(OcWI. yy~`ouV#+s\\\"<6[2[2fGhQN2z|C<81GC-gAh.Y9w`S&LH07#]#a3,l-9 4,\",\"bkqzak\":-104,\"wzlp\":-791.2,\"fsvwnuokfx\":[]}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.firstName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesLastNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"lastName\":null,\"firstName\":\"knWNEC3Ul7A&;rjI s/}}J+hiJMRdE/K-Hc+OT~4d Esk\",\"password\":\"GTW2R 0ngu^$W-hq349G9g;KZ1CN?g$dj+ W% forUQF_j+:m!-|Yw:xFSmK`rkS?zDA`aw575w0SPX,Tw4#jB12@;I[]\\\\${`nsI|jN_ _\\\\pY\\\"Q}mTdPDetTk89: 1q.C<m6pTI'm$ |$O`/vJnVGsDE!q\\\\(iizd8EYe>R iMfWM>o+SvAuNP}=Smz>k9:];_AJABkCyXrdb4gZ!zozHK`|E!%l@$ag|G0z,LMH]Pv\\\\Tvu-\",\"phone\":\"wz`e\\\\pCyf+N\\\"'FX0\\\\5-aV`E72p-7k3+G!<%X,kn3loIdxu'21V]BTjV8`:v7GO>&M&?Tb12gyZNR7tp7>RB:{0pi%6W(\\\\Jz1/H_p6asSt|l1%$F<R|!Sh56>Jv?k]S.0Sy6T2\\\"YhK[^ D4X6hKCCjeG =)1Z^e_|,7j@YweGPwqc} fn}\\\\NDTa%Q_Qv>Y\\\\!Gc{h8w1@6p8?Sz~\",\"id\":-1196921343361495381,\"email\":\"93aYMD-n~X_domFv_x\\\"E4+p+K&TjHAHw>|6C<9Qn3_XhXgx8.SKO-j,<5lm0I{=}x&!O8cnUR~:@Q:\\\".u{,nT9kaxX1<K!LcNcMPC}DeV(@wuEHlWiHk#^6(~4hhf.Z^>yo/Tpf!I;_sn'0An[p&|fC]_]|,b1'O[\",\"username\":\"<64U5I{RD%{I}z70VqAE%}g&?5:5WV*a]] 3s)U\\\\N`3\\\"IlUy;Xz?BbL:cWH^+lkTU-CJ+V.EU_x]4JvS8m62AE2GX+?*n_Nk!`f^N*O&C#-0p}C5s;kOp+O)_w'M!nGsuo~l8Nrq?+@)W<ZA%G[#S/!!+yd;@b^.<2GC\\\"8 ^g\\\\r}v<xyR]XQ?6RhczyrxXV1:ci&I19Y5UVS)J~~lC,/g7*/Ib0bnq&H3-&fQl;Lh~S%DxO4n(w`f8* rq7e0\",\"gsm\":true}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.lastName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesLastNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"lastName\":true,\"firstName\":\"'i)v[&h.A6IXDcKZ\\\"W&|KL\\\"tm8*2<a}v?hAWJ7 lxx7JfGr*|BYq(5-!w#$J1WlK: e,s.O\\\\8o>9|#awKQ9)F1}`odKCnK=(AsKy/yhTf#<\\\"L!')K`0Chj2PX+&d@BRUw@Y=3d??\",\"password\":\"7(m%R4\\\"vN`ClH<^@51JD{(a O?m[vc*\\\\B[ n~c4'(>j0{0`a17[:mjew/6 P^2QgyAU9Kfl\",\"phone\":\"`:;W}A[K)d(;w`Y7\\\"{X!vX`o{vtfXZ`Y6*%X5c~ThsCcPe)lxnxd!YtQ`gq};SSp pwqaf&08LA.ao3\\\"IX)2K3VR]cx}f\\\\=oJc.2?Z+Tb{CWm++(|H!!x`ZW'bp/BkYIk|- 'ImGb[lJj.Stu%GqMae;<JMF)An;094Q9N^LqL0x8}RD-jq:7|e27vgzd:c4:AkW}eXR4k$hc/si*&EauvO[Q8?g5\",\"id\":-40090696649116928,\"email\":\"Q3SqI VGKU~TCwtGwt<n|}pw%A{s=z{qtMV|(yErDNSezzM*e<g.k\\\"C1`YdG5<@l3J0*+&Gt!%6NLI'X_B?=CBmm)Ow,CWp>*2@|dyU,c*dsOs_{{u@8_R_EjU|v>_E^N<Wj@W3(D4fq|pNS<]:/!&1!Jmk'pQg*IvoX}CN 8x4',p#iX4jS~5aG0o*&'5]Lr+\\\\>[%1O-dN%ltj6y^0f<%3I?9a1`x.y\",\"username\":\"lB;7R;3$cCoM;#}-i}c}gW9|dzrE;y;:j_SI!/o+!L/(6`u*];Cxfgp4PuzM\\\"$V1K{PE,'Y@),1u/h<-M>w\\\\<B2%V0;@T`<Dj5\\\\K\\\"fo=g!H%Y?dt?:}'I{'{z_@<mK{%Re**g h]i'Y)7 h/3qj~80?-)!XTbSq>.=rSNC}kO!GBeM8]+|g;<WSP7n@#y8Ues9JX()_;2RG3^=K;AzNhb\\\\X>XhY\\\\&n^@7s1GBk`=xgg7*9V\\\\w,++%-\",\"xptfvvpatpmuy\":-130,\"scpeymykkrpym\":[]}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.lastName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesEmailType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"V#czpr26xUO2>eQ]r`x`=$9:kgw\\\\We7ACbgx_uoAmfq~U8 #\\\\u 91.hx\\\"mz<v.8WJaAY tdD$MiZ%rsW}hPq3d~267zK4h]Y)'Q\\\\q(s(qeI:~N|8\\\\?m~*drH[B'm(Pz8rW^n']p]\\\"[ZwytcoFgB_z\",\"lastName\":\")'A<[e`1KC3_P94d=e#\",\"password\":\"C+6,saO^2'fg*\\\\yjV(O|wia(W9`%3{i*$^b3ibnuV WPU7`W\\\"s}hk&l^eV&YIsJFFQzub(e ]cDYH9=wR^dK+3z>muc@Ug!.Z5^>b/dr~^X3%hj &llqaSG=v-.TLX{Z_~m$J'pB3B,CKH,.45y_{d? H#B{u!JbSz!~q8y#Svw\\\"^hV&z7}%L5`Y\\\\t[GoMl>uK+I\",\"phone\":\"2HiA>T2L\\\\]a;hvFrLGGGNzG%0ZtG0R6z`8XZ&}q+(TKtW6T0o=+.hNC3Jola<}.XO$EF!y4@NR\\\"N76&)(!at\",\"id\":-1265437986921957729,\"email\":null,\"username\":\"8ddBkr($CSabVcHA4tP#0Y5=Hr7\",\"xldentvhb\":\"I/yGt\",\"yypbwgwfs\":[\"e\",\"\",\"ft$HZr!\"],\"dpesrmcguvzxszjj\":-879}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.email.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesEmailType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"C|2'UnA00B4fcW789U6FF6<5JkDcq@(G{y\\\\:1e1'~:FxHrzvs2hRT$\\\"\\\"=MbiFR#)|u7swp?t1c\\\\\\\\/b:U%:8fPcgX\\\\=%uZe)mNjY?bq*9pY^[mdn2FY9=h.khTSOa(,fBR3g}bX%#R[1%@Ojw:iCY*an4>~XC^SO;[GA#`1Q$`KdL7uJuu\\\"Hh:*t1VwArD8fkO kbl&zL>qZsT->b\",\"lastName\":\"{YpoEA1.1db`&=F]G?^[B`u8.r>;#h247C$pa-GbnrnrXj6A}>~A2b~JQhrf#:6f8yJsnBZo}#99%`P1[6$%3}9CM\\\\Y=T0tL_mPHkJF#pyi;raX)T$gf<P v91(ku> 6e`oy>kw/@w93x<&1\\\"9Bn9zIaTrLNaP_m&Pe5r`3h_dA'i^NTV8'\\\\d80py=Baa\",\"password\":\"+j[)!R~mhr^rK/@~,N<BPJ,Tg*X6.'/?Ic<LOe,9jQnY8W]x=<!4mAj<aN)a>E {?]t..H^jl'=g\\\\Fwd&D>vOt9O*)'kuzdT,wQ~G3N`i*ghi$t4{L~?Q6^3Oh4_.Yc*{)LxESi,Olar#!EZNX>C<B'5c\\\\ $RK9E]KBMC);elB'Mm6,.XB!.\",\"phone\":\"i.\\\"$Zgu?%hY1S*jz[ts g8Y32iUb3fN[p$fow_v+9p6o.gqb4`9eE8Eh(,7![S\\\"8=xNt-oflg@pfO6&=~*~K;0wnq}T%Ej[D\\\";xJtCC)wR05sEu2Uv%Dv4'3lNVd4iU~fan'M_3,j,#R>;}rU!Cds\",\"id\":-3838558226504098970,\"email\":456,\"username\":\"~_d&3\\\"LC~1O^z-'\\\\LHj58Q}.,\",\"fjencyiwpga\":[\"/D \",\"9/\\\"vzV{h\"],\"ahzjsgefsxqlzq\":\"63>J\",\"mrfeckoyyeencof\":-483.0}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.email.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesPasswordType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"IYa^h~GMhM +Qwu;$r:zC5\\\"(%a*Gn+j9ez4[h2PG7I85uRNO6eh,=O{:XFYK0=@Be{F+;DnE%r5wlZOI~V*a6sG4!U3QGVN|Al,UeORrWl]>)_)g>43jD=?{lbtbRr\",\"lastName\":\"H.E'v_P7O#V}s}|cLn^ZEn9I4xXFT!l]gwF:EJuX8G&~hGW0(t4s`~yGTYs>bZF\",\"password\":null,\"phone\":\"A{Y}89RVecnAaHhnI?MmGD4h]/OTkFJk38:(3bH,!VeW_N121mKi`]WKDbD.z|\\\"23byH[n\\\"LNdD{=MQu#`P-Gx/@M~Tb]^MF:tHzvrLY6.h'$)^9OSXk3HDCO(9-7$A0Ys&h.Pxw@*%|]NMt:P%\",\"id\":-2051287302020638108,\"email\":\"qCD.-*[h+B=w3b<OOQ}XX+0\\\\,}KczB_'~{b(~Li)j0Suo3U$sm<zf\\\"dg|l:utwukbn8.aZ9:&55ad\",\"username\":\"+^J,j`5QsFxgH:-Z84y\\\"7jd{h>q~b?SD:NP' Z8qs!]P6$`f)X+v~)[2N_m3.,>\",\"w\":[\"1#=LSkx?\",\",[k4c\"],\"cza\":{\"cmevmeepxoak\":-498},\"pov\":521.7}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.password.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesPasswordType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"-~I\",\"lastName\":\"ZZlb{?Jg0gLq!TB?W9:HQnXt4Z90pW]LN/{\",\"password\":true,\"phone\":\"/=\\\"%mNc[Ff%%drA&@HSBq \\\"0HPLC7v#27F?/ZTAk?Eghr253&.FEN|GGR?Z7OF_8:~RyB37Dos.,t'$\\\\^56'e]Dn(CF]jR=4i A>tMhVzKMzE8gbIJGEmB-<p1~wNae,\\\\hzHOuP^qT!u5E*a|85r<8YDD:y94oT-iA;\",\"id\":-4473354789691296216,\"email\":\"T(Hmf X_c}DnwY,9n=uAE*-#.Ftx(Uev93d!\\\"pZ*?f'aTl;-hz3hE)NGAKbWG%CQ?bZC7;o05ZLl uwG_5(\\\\GU|W@zpMm:6CC8EyTJ'Q nm>Sc2;02q<Ch(@/$L::l77B_V2F!Pz<5fdP_yrxM8(Y0`aO-Yj]o\\\"kvxPrIU\\\"0z{krr\",\"username\":\":wOrbhEd,F7~w'qB/IT91{!]e}+j}*Kqf\",\"nydrnrdydb\":true,\"fenijbenywfhsy\":[\",{\",\"5if;`\"],\"qugfbellzdyccf\":\"L}\"}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.password.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesPhoneType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"ql0]XrR;4?RCGvhT|!1f)nS]=KV{Re6KJ<a8 !@)j5<n\\\\jh\\\"M,87lC-{pq20ca-'Ff6p-?0U6\\\":#Q_d%VX)w*{Sv955M8+a-`k6@4;RP3d (j&<_Qs(H8d\",\"lastName\":\"b2PRP|{*Pdc(79k4>V#xuep'rZTN1GeIaV^#u,+HL5_\\\\'t1|Nx;}^U_iTErEB_&KHi:bMzh1k+WYE}-v_IP7IMbA!eCq[hoRch/\\\"M\\\"2eU|L2`YY91o-$jmv%[7>9$[`e<5,:4GP4g$S'J\",\"password\":\"p\\\"A#$8KCRa@giHLq2Vpy}~hIY5>NNbOl2h%g7]w@|,E.cJ;#!?'xj'9;(DI\\\"n1N4'RNIUt;S+kY&d&]gecV{$F->[-x2IK:,{l\\\\_<KiJ&+#%Zj2vIZPgG!z!|omsThrX4E@_r(i?\\\"[?gtBg/)P)U?`1ie~>:y[.'$a&:)952gX.9yF%&ct.Ky)^AGgm6m*%)Ldo~||t}EmQ]%%8>%\",\"phone\":null,\"id\":-3707036620840720467,\"email\":\"3Pq/RF2\",\"username\":\"w`Xn)HJQa*cEQ88b6k=HD6Ek5sr&#I<<{1@z\",\"exagkosmgq\":true,\"xe\":true,\"oo\":[\"<\"]}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.phone.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesPhoneType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"Al'N9sU0+nlLb]CMY+~VHg$jB_H!ujTL%x[MNB-Bd_35wnP>mx-G^6w52GhBzHAj8exV<Maq73l`'>G_}m>/=,,hkpVM`qeS+HjSp8{.B\\\"P-5qVQUuHP*6&p;G\\\"E>>-?\\\"%<\\\\ 4e[_pB-=|'(%Cpv.lKA'=AgP(<6h\\\"D?cZ>a?%*>\\\"JIK[G@.RPSu?RzA9>cqRN*dnp}A0eq3{!:[1J.SFyevkO\\\"u+z/WZ1,?=*cN6:\",\"lastName\":\"18[N!dy)(%8A7pjb|sw?{x7n]ozq?*[Cu-MkG<U1\",\"password\":\" Ut1'Um#y$\\\"(jQZ#f1(X_.05v7a$N$r\\\\KN_-}n4n6@3;}akK4{3.OrfSA-&D&)'Ng6_8&WQh6dWv&0gSFy?%pc}O!*0iA?w6z{ gFsPc,t-tbRk7&Q!<'q.46,01w*lF^aFp*S!do=>%C{~*VBT[x(%wtH#Ri2ZwmH=ekpB&+ ns-&x-@$8MyMd~w\\\\%#{m8rl ;nW$@WgyCzeXF$So)l(aAKbCdTY'%-]qW@\",\"phone\":690.6,\"id\":-3865967334290384318,\"email\":\"y*btwFDQ1k**[s&01GKvUX3bJ&R{M1QOt$z#?kM`Ix@+ p27(Qt^L]b3B<e6-^/ sa5X(0*aRRRH{Y}P (4aat4Eu>1O6q>s7)-;p90?Up8f`@d?7O[xM0R/wWx[dT\\\\<F$v*Bx80Cc9 fuzZ:RNV$'hG iy7G.[Ks){H)UH?CJ&C]qK[A.+RsSWK@\\\\ikl+j\\\\}\\\\x_of{;wT-Y#yq+%N}{in6~x=O$0gzp2$Z_4k+{Yj|5`, 6l:<R\",\"username\":\"qh/-c0p`zG@`tan,>IdfU//@$.^D_71vsJC`O9?`J.klQ^{)$=ig0m~M_{QK<M5C6?>igtC\\\\f*D0A,uTV1Z\\\"7hhQ`|mx~(p qvL{MqIqmDYkp?]r(g`OorP1/8+SL.<;KqmrxPg2TWe:tQFkB){Uue&M^K))hXAm_)GlIB`vX&B`.#H'YH'#Ey$Cr}K.i\",\"kph\":147,\"ran\":[]}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.phone.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesUserStatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\")\\\\#/lQ316l~a\\\\PLB)BsWO`Rrnx!{:k?v#,%YkCVC'*\\\\kvjE>j^3C^_l29WpeoS!2AJ/#y}7lQJ .,AH\\\"aul0eWB Mm'@V\\\\Jb'XY[9(fN\",\"lastName\":\"q-MHF3zCM\\\"m0U{k'RY&)U~`yPhY/I{f`5&vn_C?cR'HR4|6g5#B<4q \\\\V%NB*D/mod8o:|z2aoWJGPn)>).^`!,e=*Qts0LZ6+br`^{7N\",\"password\":\"8cr.ll{zq6m{N<J>6|Y8mI\\\":'9F#|KiC`YJNc8y6x'Jk{\\\\Z>T\\\\hEiQP[v?c*bivWS:L%zAo0rH0kz\\\"bqZit`0lM3q|B;2gvLT7V)<nM(F|z^@yziG=/Y>@&|i:~A\\\\gH=UFXz(i^.):90)NF<|0/Aw/7BLpymK*Pi6\\\\.q_c|e9-<>uv7@HB@L~tq_zmG\\\\87M?y9'fBq)a1()}1NM.ba)&h)+^?m {(xA^D}XAem*;ii>35J`*sa<8~mD\",\"userStatus\":null,\"phone\":\";b!G90D|MYI/<T53RPrp{Y`hE0D)=-%<$y\\\\IfVIIpCZs`sX5kzii_Hf$x-)k_-{2$v.u\\\"2-1Z\\\"*c&)a^AVBd .D\\\\st]I QO{:(3(_iwe}J=u+\",\"id\":-4165123598275695723,\"email\":\"GIEEN]lO`|^{%lt-yiVy\",\"username\":\"Z\\\"|i ?KHHr!ufa:+T$qt-C_E.:`\\\"eEH$d<=|e|{zQGs0f\\\\!9jR&a}ev<g/7%tz3qeoh@fjMQ^\\\\prD#{\\\"@VpUoZQ>zB5}0Yj`|ekbx[e|JW!B:2eJw}b8631QoB.3zMRh9/GQ_1,H|oK?@~iV?*Lbb8V%HAd=V;Fv'! 9j?I?,r`m!At7fQ1SqMSuQ_\\\\J-|U`4u,he2wFu\\\\_QwfpZ;*$W6-)kB_UMr3<tz3BQi5B]_\\\\fR(t}[oFWQ3D?';4+,:}[$\",\"zajn\":\"8YQ=rq\",\"yoekjdsiji\":[\";$Rk\\\"'V\"]}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.userStatus.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesUserStatusType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"VDul`K?%%zVv50<?,\",\"lastName\":\"!ZfkpPs@u5B$|5, T6/@hJ\\\"+rHWE{y\\\\x;\\\\phrKi4Z^!COz,<ElKzg[sKI+/t~un[~pTNtWnel h[V0@sv:Z1sY^kU`LGe4z}n'-%yx xS<j\\\\FY[8by!|{ bRz~En0q<;W$,+n+dnYA:n(zH2i]kF(%`kAg &^}&**jmTs:1WRDF#>}9;['a}n+>H(%':XFt>D\\\\!17|8B8UnOJ^j(iX,;u9HY\",\"password\":\"q{'W8W#CnbH,M^DMuW_wuQ-!Eef,NZ8{ noDwCtio\\\"pxi.]`PR`Jg'cD!3o\\\\!Mvb(rJT/V{R7'tgvBx5q?y/'HXU8Q5J5FXA3%VmGd8bR2IiJ`7}-nQk\\\\NH3bCNKQq!WBzg&6roL!vPeeYdb4g@beP M@ElV%5ixhPu%>h-d*IsYZ:#3:F9y8.9km&0@/;zf\\\\p]}7xR.atY)}<&Ly651-?6d|ZSno j%=1-OeWUE8xcV[\",\"userStatus\":[\"p6i\\\\B=\",\"^noRdv*H\"],\"phone\":\"O'TP(acjv2{af4 GWf0$U(F:yU+%!+/ji))mcXbUx4(G<I(^lka9[p#I7;`qYqK6a5n;&~G9`\\\"lmYEo|t^<?H][r*5@QZXJxW'ztbG@Qh90\",\"id\":-2541385773683694417,\"email\":\">d,Fkp<.aA,bX&#^_v@mg(>wMX1~3Q6DU%\",\"username\":\"?/}dY)^r{m7;_U[on;M[N%cc!Va*RG82BUok+D)K7YNWB_\",\"o\":{\"jetix\":803.1,\"dgtlorbzwijxxopt\":-885.4,\"olkdnx\":true},\"vqukgipsjbhbh\":\"0?qfP\",\"eqiucxzskdqn\":[\"lD;[,#J\"]}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.userStatus.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deleteUserUsername_UsernameDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "~")
            .when()
                .request( "DELETE", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deleteUserUsername_UsernameValueLength_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "R>-%\"yP\"sdmvy=vMW-+o>SgB*}9.(It`*tewX{R!HDsdnS-D^l\\j++ku4>c^j4\\`mU;61f-3N~ VsQ~F3q~{gb{3ZRO6F6A7s8;8K;Ei?>{HC1. jdu+h1?A!'APfewX1sD?lTcu0)7f!Y3[w*t `he[=44;gJMFcs&{=']\\FEpX9.[>V:ixqW,)jv(Wji:C5?:")
            .when()
                .request( "DELETE", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deleteUserUsername_UsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "")
            .when()
                .request( "DELETE", "/user/{username}")
            .then()
                // username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserUsername_UsernameDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "W")
            .when()
                .request( "GET", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserUsername_UsernameValueLength_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "*iY\"]UzPqKd-oIL/J>)Q&Sj4i@Vc8y>-H1`<O7Nb{I@nvDD25/K/@p++b4HOZMo3&HOi'=veKkM/-X;>r8")
            .when()
                .request( "GET", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserUsername_UsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "")
            .when()
                .request( "GET", "/user/{username}")
            .then()
                // username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_UsernameDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "I")
                .contentType( "application/json")
                .request().body( "{}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_UsernameValueLength_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "XG3R/Mer:\\xn?0@t{tDte>qqCWKF[?{a.w~cq;;'.K4XT-FPQ/<Z^we(!`R{D&n^m=#fS|>9v 6T|D4tM0g!>x>fc6bK)mcBF+ 5=F2L'Obl0mQi[VNfv +`G5^}_E)\\yY+=J}/Xf13J0283m!m?HbHPWw")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"rV|*k9=^^Oc-n%8XdL,&0T:6ya!,.U7zW3i[+;HlQ~j?`;-$K+:A|6I8/#=d+sNcHJH&-?l8Q>cmf6f00Aq_+30e:g&Y|ZDs]6}'[Vr\",\"lastName\":\"d2i&3c +rriBYE`+N\\\"3_9xLaHn;BS#8>J2 ^pI?D,4SO$[&ISK@ruR+s)Q1@ap1;3/NWrBe`J\\\\*=vnO3QFJ7\\\"*gVQ{%B#4PeQ08jB6-Q/[XukKB[}aH (=CJ<e3_)Vo6p~`b?9z*KSN4o6T8\\\",>u]{]xLbKKq8st7`#MSKrPxN9Jm{`}'_6e07I`x]b,`e55I\\\\iIsv9=GR2jvP9p=qi<p1E!FSglh&99;.9\",\"password\":\"Um[l/&A?t(-b{J`1!f6nw1xEeo>Ip&ato6/>NGNcdPNk,-I,tN>,*S(Imd-Jy6\",\"userStatus\":-413088522,\"phone\":\"KoD7VpJU}yIeZ4?\",\"id\":-1506735653523116380,\"email\":\"YKt6CK^8c_yeUGi2'-kTXq_M\\\"e4fS6Uw|[wtEf>*'hL$&XT/3V@,/&L>j*o5T6]j}HPn(%dki/.=&#Dx $<-*,tSk&S;Xt]@{h=4*])v3z)uDH\",\"username\":\"g7Yb'.CHn<twSS$2uRTNbjy([H\\\"lTe%3s_cUJ<$lQg S8^RC+F;Ed`ohj7G[h#9|lIHf)O%CcIw _}[V[t+8%]_>2S=IXq&~al0=l!+6j\\\\wbyL?N*8ky'_O`m^B-jsJ0EyuK:H* X)>D]d+r)&|gDxDjg@zF9,} VwIO+d!_dDuBzK^1)FbP|mqc9oH&3;$X$SJ>7,wXo>cJ7m%JMi`Pp:?Yg8Nh #Odkwi>DfO\",\"fhxibljoogfbt\":true,\"ifizlcmfbqihgv\":\"\\\\\",\"dbvnrusoqubrh\":-76}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "m")
                .contentType( "application/json")
                .request().body( "{\"id\":0}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "QH6cgXS%%slrk<7>Ug_$7RdkVuLnu;uE+Zj7q#%`-#|-,}* 0J`KZ<F:~w=?vo.\\g{43()9ICvlNT;rw 'v%0svW#CDkm(|y) BxgGOG':.XG?j4e.lgP*@/#@w:),(hP|3pHkE*\\]goS0F'}916j+\\?MVSewmne,tt|F-nVLErzBv2h~toyxRnzlsO.N7HDPZLZvlPfvN;F?atj;n0zA/%EWS+s(\"h?mVZih)#\\.1[`4{/Jtw6Dv`KVQg' s")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":1723127122474863023,\"email\":\"\",\"username\":\"\",\"amxola\":[\"vD`\",\"w\\\\I}uQ\"]}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesUserStatusValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "U")
                .contentType( "application/json")
                .request().body( "{\"userStatus\":631603404}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_UsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"7W{hfH_~4,xUFFO2&w,b?}lycplY Ka`v\\\"EID[H0\",\"lastName\":\"l0s#CQ{x6qX(B$B0p=oSu\\\",ihno1i@nP{2m;$kIix<A|Ln=x`T_07ZmSMGF-d+,tx8?1\\\"D05_@7'=L#FXF/7r7r,(Yxa2,A2+B-j$s]HIpqrGu|gnP$VFIxP~zH#Oa_ _kw\",\"password\":\"efpW09KdH,B<hr&lo_|pJn#hJEZ<lvNQ:!>QY(/FT[PsL.]p(^sH?k*EWF);ka~tFA&p$K}_,&.Xo%qtm^oh {IATKtBht+q%9:}!FhSsc?G!MDPFn|ZfZN0\\\\)^kjqAja[!u@N\\\"uT}8'*<\\\":ji=*0~jRjFhA&b}G1i~Xv-Wb&|t~UQ>f{ksi'WY$?(AdOHVZ2>{NR~'7#/OVdZBEGNlWO;KcV43\\\"sCn`3)Q6pHMDmT`;rHx;LCn5<\\\"'\",\"phone\":\"#u%%nF$(9?/dJg>w/XY7]4m#:=v|HQ+}2'DIPh#0(50VUacGu]gW!7Yay9!&4?F3@o#Ua;SnuiKF=ZbSh=\\\\C9]6I*s#ZE,pfs,\\\"fcR4Dq~)v^smuw-6-{XGDk7'yY*rRB#;r!:\",\"id\":-1634512154414909684,\"email\":\":KqI,%>X?B(duhY[_`W-hoL2/d5CdZTy{>GINN>joXwuxGfIFAW(lH=EefxY@\\\"ej]qnWudH]<=J4 w`*V@_P9A,Yrq]231%)2m=x69c)QA\",\"username\":\"2iHbr#R;)+(`$`&dB$$M<W.#(`uk<mSueRbys4L& Tl.9&O^voA^ET6h+acA'f{U/B('\\\"1Wj,27&Du2%^\\\"~#[~2;|E%uAh5nbt\\\"T?h\",\"rez\":241,\"sku\":88}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "z$O\":>azy;Vs:\"]Qk)|eR\"KLkt:6HSY&0!@!7$#YSzQbfJ.L oM]FW^9iH{_|?QSy5IkF(9?>  Gz]GC)?gSwh!#PbXbfp|eCEUla+X!k=h5gi)1(ig<")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyMediaType_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "OQgaA~)qHX)E;9{fi#%BT.J\" p&&`]QIfrw:+nzz_")
                .contentType( "text/plain")
                .request().body( "[]")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.Media-Type=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "(UsxB[zsE~4mC34VZ9<`jgvaq 4gP[=$c=~FL:w\\=5l4fTaWeNBKE~p:Iu&IdwMu1ta(Hn3Uvn2[C)Ge=~kam7nk^RRp>W4{$ge CdZEn(?qDKUh6k$Z@Wj,GG\\2'/wO")
                .contentType( "application/json")
                .request().body( "null")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", ";Q_z/z`Y)fI]0jFOKv9qrOe\\k=2lV(V L60fnJoT5nCLB[UbDn||$>b S#PG4!lo9\"a-dUx;FWf]pK6m^)&nU0'#T.q.@$M(,/{K3/E1#X[\\#f$5Y]Y5_S5bRf&6s:8o=2&A59X83<e )@NQ+Y]>bz}X")
                .contentType( "application/json")
                .request().body( "-546")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "*.r0&5%4SJp8,*tMreE3[]Nm)l#WZT7|!>tH<c$z!~QhSr#]m?5S/l=T9BL}{!xN{[P;b1s2.U*5W`UIUy]2cu/@^?@jn.;|43%m,|hja\\#Ry4xLDEOC6u]\"3=@{J?Yv;&/f")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"<,yHwr+NOGi35Szj4~YazH}tHFA#Ez3*Bm'j^HjvyIj+rT\",\"lastName\":\"4:xT_YB[{tTI_t7ZBGbR(?*#*g;[!^c!xX-M;D`In$cbhj_-?gewoLoi&h:\\\"Yq3hsgX'QvMf:\\\\d2|X&n_LW$\",\"password\":\"M29\\\\J~e2w8RYwRu yl6.}-A%ZZmhSTKsW.U;?5\\\\&LG}^,,{>sQ8QWhhGG:KkN6%Q:\\\"+0jt%pGmVU9w=x7:Z0kKWz\\\\vbw46c67#}*yZ#%47PSo{`nvU%nBnnI!xu-^m6r-}6[2=pvn}m}+KgBEq5]0.RFuB=,UXO2t_a\",\"phone\":\"kP32':K)O^M~m/L@!=N7XPg!|~O%\\\\G$V\\\"^qQWj-g+lV>%HsaYv$}N65fq#{VH:Lw;q$R8evM8DG @COX6?B4~UF_\\\\]j~69FJ)3\\\"H/k%CdU=n=)Fh/&uqy~7eU9ra-Jmvm!ZayaVCQkH^<@$]Du?vB1N\",\"id\":null,\"email\":\"67y8V{au)tyttpOKZmko-Qp&)N=y7>'EvBbNW!}lPOzlCRN4!]+$EyP0We2tl|p&i% nWR|SKP5Riqw4rvL|cBo0sLOHoEha:~C(p|i(Q!c*(_yd&E/7{`C/|+!IM;[K8$IWF~Fd+ Qqr%hQ]f(,DH?p?GrC2O-90 q=xp-k>[`Ia_MiqCVaH}OGA>2cl]h%,L\\\"it}1o720PK#^\",\"username\":\"{nLX[>C1+v~y3i\\\\5%0Fi^.]WO?d2O6`(Ulf;DY2\\\\ W3!z4EcT8Vt$n,[:Lm4'kb'}\",\"jbrnxmhliyy\":{\"vtheptvu\":true,\"yvs\":true},\"utoqnzrlaciuws\":{\"dahhq\":-83}}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "1gc3.*==kABdp_u,g4 [3FlT3Z>vvtn`5^OUi]3\"mX^Qy~mM^n^7v<:t@ 3>H>^lda0_7lYO<G*6*c:^10>|^N)ap]u_PsD1y(17<,O\"2 '{CVrEo2!k,mrGI&%cm}`1DiJkWi^)XfaMKGCe4qM{-N/`IH?fPE&+Q2->\\Ev_`vA$?|k,Wmmic7K7W*Q9g<Ju)!5Mu2:g-NG1]0t{|{1`rR80yX:5z|eXa1d1:MHo")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"Ea1`8#fn^.\\\\ncjbe;k-1ohk`P[oe%};,76Y~3rvE\\\"6hp0l@'b)Y(WM{G\\\"Q}K:<|'S-bf +(PY=)RT7UjZKP5$DA{PpTxy\\\"s6y7YVE8( 5r{[]O|(c4'o'.%w{tSS[#E`\\\\(F5=6?zI=&Lq{]5ro-f'QNk7J:N2<:H;oBsq0i)k%Spt&>9<?P,\",\"lastName\":\"V*PS#!o_'<\\\"6;Ww\\\"7q2nnKE)LdM/{a9YxXS93Eg$yRr?m WZ)@l*LFX:wT3x;6yd_:|Mv E^?O.ue|)Hu@fb._6{+d*MMy&9thLt+k_KiqWK&r`FcQxm.%F-B3x^rIy512qJngTsUsrT;OooH,=met\\\"L73fn'V^vkJv5m\",\"password\":\"HWD_h\",\"phone\":\"'RctCCWM|0#\\\"l\\\"S^(H-e= R<}!&d0g\\\"r(Xns#^A\\\\P'aK0z[(xm@RX\",\"id\":{\"tjbzsyguhttwi\":\"z\"},\"email\":\"t!_I%tKL_()tDl=HR3B)f@5[F.J2R*9tf6}t(/h\\\\d.'%z\\\"w=n2a-A@~<0o+L$5j!0\\\"lp|a0w>pCJ%Y+/FD)DJ8>XalVMLb#oG1UOw#L(>weP+6]_iwx)}JS;DZkUm$tsNqSLO_*H~sj'7!5V.`e37DrJYj{J_\\\\l4{:nFg|w~OjCZ7Y}1|rkq^H'o2-,S=BPJW3mDEFILnF:rvKM\\\"U(?03V\\\\~r!1 BF!4VCA3@Y~/VcBd`l,`xPN-^\\\\I{;gY~\",\"username\":\" X f86H<\\\\I=Bqs;RE9r3O|i;1W741kajQTJLV!P{kE__NC-K/lSZA[!OGowSRo^(6t/%}nVBjRbR_d*ph;EpH=\",\"zop\":-160.3,\"jrrmue\":-760.4}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesUsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "#PkejtTk[C&N#3n[W&FZI8yJ%b40c9Ep0fy5$?+2<JFKN:t5PaI eB^$jwAxh{Cg75]N NG}%\\p)A<J*-9z47#yh:l02*Z'+>;%>ZWO6F{sPCkt$A+(>f &9Kc]f[ebI^3ER?Akm3v8D8\\n\\m)UNk:9;kMR[U(_zd'NA1Rep?rpt&#0+B5yN|qN)G5N*7m_")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"{mnddt] ?k=Y[jWkrtW$b60?#K]MV(Wo%a>MWrx}10tvCC\\\".0]kNP/y_Oc7r\\\\+@ 2~U\\\\9JR1,s>P=5NcsOSIz&R}Ti\\\\6*DgJW-r8O'vt8XUD*K0_1l.sCse)f~ZG I7k%!vIM\\\"(yc'Skb/G-Lg1&hFLyoGpgv~ZPtQp..z?,6q0xr?8:u5Tsl0jo\",\"lastName\":\"xcUW@eIg`H%)[loJ});'Vvoy\\\\?(.i7WcE>`G4 >\\\"u;zU}e1NyUxi.Ygmde}A]r~tQkrlw.,hM;Q}G$$Eu9ZXrV/_LIyMTe\",\"password\":\"Pl{gY&UrUQ>Xd\",\"phone\":\"z'ow::!V/Q/3UKG6627UswO5oZ#3OeIc<NZZr{1.6r4JekO|V['M?!FX2/Y6X,DQjXC^Tjv5qAK8cT'(A7SRo\\\"o?m0PaO)VVs83rsB%Kj6$1EOBZ0#KLJD(~(c\",\"id\":-3651582971745365976,\"email\":\"yf:s9_,ENxQqNb]*G6o3`vXP1lQ'6`%|!55B:)dYp$VfDH#CF6o;#C0|C%HJ2w]aF]Fq){`xV9N]XE>$o\\\\$EmExM2heytUe6vW4$)EJ[<edb~Q$i'^kiyBJG:oX4nkAORm/u/6in7MDgK49%`` vfXNO*L2~o{5-0lFe%rKK|'nDv^\\\\<LfGSBn4,;A#).%srz]w~iSl>}Qg)RQ9e#z\",\"username\":null,\"ir\":[\"wQ\",\"Pbn*j\",\"Ri\\\\ua#\"],\"q\":-379,\"ykszzhkciebxhaxr\":\"\"}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesUsernameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "EhYCI`D*!cQN)]'$=VPN0U|3R)_6ZJhZi\"ZF,2~yCbOmU_'9r^p_Bos|0K*I;3s(vI/-c-Qq/HoD;t[L")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"$xo_`\\\\]g:^=XX<^1X5(M=~7t?qNa8)vRX\\\" &@u{_YFKE)p5q^U&\\\\0RUQXFh_)|y~=, .Wiwk&\",\"lastName\":\"?[LSf2?COD}#C_Cx6:ea~0zO0BKH qm+\\\\6>7Pl{G}}<_U.p}WtCjZ<!9$v?vj/Ru!m^&rW6\\\"E`,aB_qXd2okP6L^987af0M$EMwn\",\"password\":\"r#dz@aOO&I(*k-c.O~s8=Z.*3X-UUm&|/lg$*Wk6VwW/d}wU9$?Os((Y~3KX3^(P,'*$cM'aIy\\\"gB8ZuW3741m+PUGu~+MTK{cbVoYsloz$tQA/nZB(hFu~}nYe4.n0!Oug+-LtZ,f3rVYBt8P-YN@usLd)og;&0*=Qy(6TI2C#:,6\\\"n^sujs\\\"W3PpY_e?dE^e92spF~@/TF[iFL*2b{;2ZdLLY%T\",\"phone\":\"8=Ct7dz67V)/VgBgm#yv{,l#>wouBl{$\\\"SGs:WIXWGfIEuK%6`ZJvnupl(8Y4F465{`VA[PpAed2K@HM|Z|$oqO*}i2RLgg)GJ){WiC_p,TE4bLdGLh&er<1DD~C;K=8UX2+9tB?K`sD$!Zxt#ttX&'2r=n}>GG$,jF6A(^f1?*v=P@MM\",\"id\":-526221936120781019,\"email\":\")r|*TvXJ?mU9\\\"!5>$,{<o~c@Uy*Lu5Wrn}8->(zYOpSZ#LE,f3!%b'S$r%O,X/)Bj+WgJ}NxzT\\\\mBAo;+3n]5Tn)440@Ui G~)|86$N%g?r9wwf%T%{Y~@q)&5BilIpHbuE\\\\A,Cg\\\"jyk@U;=cdC>t[]A%N9\",\"username\":-242,\"bovzi\":[\"8x\"]}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.username.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesFirstNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "dHp}=gO\"KM>?$1n'3gBNy,/JYYn^f9AjsKzh(h\"DO{l+*LgL![\"^0r+VV,!8y4WzEZxaj<4@HVT(b^9c|K=Qv}xx(-]En3wz,T2P|G,u~|>sAIjpXwHzei#rup3>vI&W/52bm|&]*F_?WJ%Oge>=h4vt0}-bcgCOJbVJQfR")
                .contentType( "application/json")
                .request().body( "{\"firstName\":null,\"lastName\":\"ddlL)?]E15}n!08@'8bj38xMy%dV:t`'wADCls=Wt0![|2Wi' r_vzgj?:I}Sni)E2i0Z`jB+,Fb2uQ$d#A NyI$|\\\\.ia<516s&ipIJg-+~[12<k+,?ko94`V{-j.)K?3W{#gF3}^rIROj~^n;3R`,<l)6H8\\\"gMW\\\"HmK;%Y8+?lK_J-yVv0PsXXD;=[Why2d@P,NEskYRZT.dz|qGW~f}b}}YfH,ewS=p'}\\\"8T|-%RL1MO\",\"password\":\"LLoHKO1S~dr*?b^; t ]s 9RDE7PG8f\\\\(9\\\\db]ca@4+Um*'P)*pZCb>hgl]{#MU(?tM*Lc==:+-J`Qa-ltGT\\\\Pw:3rwIgl:4P1cyPZ\\\\@4Scs{U_`0[|YC?5xIwe/\\\\~Ti/<32?ZShO$0(341B\\\"pmn1CRQh>V!{-t?<~!M>c${t=Hp5^5Jm7^]3GtlW=jv{3n /CpE?R}MNL\\\"lm+Rht77{_!f\\\\pWs(B<HWpHBD@h '}OB>no6K'|qjG5z\",\"phone\":\"qe3PuRmvki#tO}&4Ef\\\"P=NT#\\\\Mt[J?t1-279ncu=pY.8E;IsL&Mb^}reR.Vj^8$NY$~+nI-xtL7TW34g$8T6*uN} o[q7b?XtT9!\\\\!D wJ^PD32oSBh;9g28P{~LG4CEo1ml[)q6x%X(sj9M,orHaKdz\",\"id\":-1044516267703760407,\"email\":\",#p>v6_?l!^\",\"username\":\".+b<;B VN,bO+bD7rS2QF2h>CqbZSX|*Mq[Uia^R$,p?dNX:QC3!'qP\\\"0D{G`H+[D)_W5En&Y3&mav`#*p<6aY%O%wN9g= ZmVC,-U*`H#3k<}j!:&Xx&6f!RC:5~N6dp0tpu@\",\"iuab\":true,\"totuncseyy\":399.2}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.firstName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesFirstNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "ViJ+'B7\"DGIBoduCM)tQ66z>J;%P+k@aA}],hnEX!&wxv,\\tS!JGv=5G-YYU(SQp2q_88vtH21B_V3P8Q_< sdCzTo9Vc2=>v8jq8Ljr<a_fJKfP\\(0JUG@53")
                .contentType( "application/json")
                .request().body( "{\"firstName\":true,\"lastName\":\";gt;SUzWJ5<dcp:20<S=~[Tk[8onbOy*m\\\" Q9kRuZNB~.F@ee%(&D`Yp&keY8s\\\\0E]!Wq#ssDe@[R`)gq;I5b;J=iR09[dJV%$[oAxz9\\\\(nrw2$KYx0JcnG@\\\\W+(Ga1P~h.bMh%qB_.?0Ag%]\",\"password\":\"oA)qL6!?,Sj4,|X]{WT|B|KTiY<~iu{>IJ;N}9*,Bmg1\\\"$<X1VLfu:4A,\\\\.+|ewwyS#<YHt-,!aXb!2Dc]AQxU4;8W7Uu#|sn]L8$$AkT=jryO,I5k:n^j0Wl:\\\"O[3WT=I\\\"9\\\\C9xcsZjF,\\\"r[osi>5x[`@Brrx|1ljs\\\\&puuohj\\\"Gx3`Al~+x{K9IiNu~Ux,:C<G6Z[%9BR]ax3s;=s{p(:0i+jGtGWbF:5DKeI@9+FwHtn{\\\\<i^APJ{:X\",\"phone\":\"%V974j/xyC6&PXU\\\"3&I&8oe(d.j;J10MRE`uY'\\\"6hX9<oyid&.Mmd3#c\",\"id\":-3393644290292195136,\"email\":\"a!vbUu0Z6\\\"1B;Hjyv.-'\\\\\\\\?j7J.\\\"s}p4ne1^SF$^'A.X$MX>RvH*/$5\\\"tm(fU(1Bp]h0F^,m3\\\\BFWh~&A](<;+6rR&-|(gemf!Yk-Wisu*4+h6[ edH]-4aZchSG>DL\\\",Uq &7j~gHAb\\\"d6~S*'h69cl<iU[+YzbZ^&'/]:F\",\"username\":\"V293BA S_]8C$-A&hG_G\\\\o TV8[m[?pXlt(h.$iSKddnPGo!L[BJpW>\\\\_Jkl>KB(+!f}\",\"hsnqsf\":\"2AJ+\",\"soagncvqriwfejtw\":-392}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.firstName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesLastNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "3/^x!|yDH.]=Z{_J6x")
                .contentType( "application/json")
                .request().body( "{\"lastName\":null,\"firstName\":\"M\\\"^HV95%HHk6{HN^n~;)Xw(?@@(-*:++THeSx40i'7!a]YCYu8W?oa/s\\\\f$h(<[P%K][/wj1#S{MXdTaq8I+5A1)W2;y;VT+XZ6|[I_qQ]4IsTOix0AH]nq&H']q+nu?yysqQGM`SF911>[ u&jKtoccF\\\"hX.FX5#dz\\\"g1Eh6~-qt<4_s;iCY1i)w.[qpGXKenyV=JL%Gyzuy6?2zM1UG}m!<`q$\",\"password\":\"' eod:>X9}|[g^?$p?tV[N`,6F_0V7&iARi,{0\\\\Jr bVv'&g{_\\\"pTx/^\\\\t@]]Ygz\\\\jS\",\"phone\":\"@#M%gRS0Tox4o*3\\\\~Pu6|iQ.R?_$<qU@Ze/<Q~)`+\\\"Q?4''RRBvV3!b#J%Vr)pv1ccC0}R8s--zo8]'L>QBpN-cb9\\\"GD}gFpw!iz,9&\\\"x9/hRjVGpMg\\\"vinZwWvOQ,o7r`iv7]Ru%@CTfh.\\\\::7{!>C zJep74094H$urZC[$S}3O?A$ws3Mu{{#3x}<HlP\\\"hr6|,u9`u0_EngB/.DkcYcG(l(hQXN\",\"id\":-541587717494431223,\"email\":\"I;(X?MT]!~rcY3}Xa#.c{>4BmZ6Wu%=JH~Efx'f`or ^iw_xSq{&%ypFq/`L+/4YP<]x#o;E{z=^dD\\\"I>.3((;hxXpFu}E/V*Zebf[RR)mGo9u{_ATt%,5!9~Qk?w;;upwj erkJBkj*REMcckKxFZC)=AL]?Y}q8/,WSUpP9ll_^\\\\h?GYu8|j_i`YN\\\\_3)Js* )bhHV5o)L*#y+Sj)MI{_fmSl|\\\"=tG^M![r/s{nC_E>&j6R2 \",\"username\":\"|te2AE}*E]VaIx:sY8=vYVNcbb(<4E|t[V% GEOF^R;L,sUdqi8]n4 ztIz]6t(Fa x~si>EesnsbBwH\\\\bhZLO}5`{}):&PqR@/xT$v,|Ic4vn/@2*mX6e3k[|#lX!\\\\LFmmMC$UvZs$fu`6*|:Dn)O_>\\\"05W\",\"uollscpbppi\":{\"hlwpetp\":-85},\"aftwthw\":672.4}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.lastName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesLastNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", ">;es.Kh'!0_n]~}am`-T!eDuiyhbne\\^}D{\\OAG^B0G1>~.(P0(r@m+TBJ~5aZF?3&JWj~E_\"QoxMC;T9k{[x&%H=?\"zV' cIqu.g2V@U~GI\"*2WYY0{.ygBP;}T@)D?H^Z)tkbOoc I]|=R0sJc:nwm6'T}7e6k!#@@,)p[Hlp>%")
                .contentType( "application/json")
                .request().body( "{\"lastName\":{\"rwmujgzjw\":-784.9},\"firstName\":\"=TD7Be3D$?68v+t3L<&Rq>3kdziM].bk#u,\\\\C]&B;[$(.\\\"+C22KFG|Qh%hZ^@J'F:s,1n T9=Gd4IXd*{uzqUA'slt!Y{'zo5`s5=Ysj)t1ss|4@:Axt2E#(gsWx.q>o\\\",+QH5{d++P{2?A+([8N\\\"lZ^H-.\\\"1T9]]#_<|\\\"\\\\9mYNB$G]RHk)l\\\"bK8)%H%(kd2*NVlF/Rb7}inqY?Mxg`1}9\",\"password\":\"\\\\Pgha1z]r(sc:\\\\B.jEzb+;UN>w't*\\\"48/'-YT\\\"i'@<p$ye/RW^(Mx TgMY'xxqLq1|[lUPq d9^q6+n<rq9<*GBt-GN6Y<Q)*NkthP,hR\\\\sS#b\\\"%8PiqI_V$Vk]a~N}OST~*+Kp#?f?0\\\"W;1UQmJz@n|b=C[S2sEr7o/{uc40@)m1B|76I6ucl9uBdw5;u9zy[J\",\"phone\":\"/WlHQ}3LMF3[Sl+h{||?dY://&>gMQ}^2W/1xc4{UU9WA(rO*]JD@&s*p:tu4YTvc2HAPT@>d]xqJ}2uicCFPt~Ii1W1wTXF&],o}<^.oo@W7zCE_MEZ<cbGlG.G2:P[PS#l<un@F<v_KP\\\\jq}iTMY,.mrb!1Gw\\\"+A%EA>_xw&7U]?UfERN4X|OX46hNrf\",\"id\":-2419076745179636449,\"email\":\"WBwo~aI*2hH9=(ag.-ytVOLC$STP(KYuWvh*U)-Vq*r<cxXB>*G$tFAbF!rJ#`68c-`iTga3z|i-^v$#I^}\\\"_H9pkrO3u^#']Gan~ v|Z#!_5v'ZpD2a\",\"username\":\"q'^dl%tj8:j/5\\\\C0~,l48,7g7o)JBmWzUq~F:7 \\\"ZEq5?|C6+-SB9b\\\\X(6\\\\dut9m/4N2V^E=S3(5aIa*t$|+x|;7'&MZb=&qUd|IhRYGMaUq5~*vsk(R>.Ow~exdzY=j-,1\\\\ZqXbTi$}O_m{\",\"jnxhkiry\":\"WxqdQkt\"}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.lastName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesEmailType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", ";GT{Tmd.)DoF6\";,vi%7Y6q7SP:ePw.NMC")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"Bb=**'!hv,Mn~ZjS\",\"lastName\":\"l;{*B8*N\",\"password\":\"eESoR.W>q*vs>[XFv2&D}Ks_\",\"phone\":\"g`Ad)2js?~\\\":tlReE0Sq%a4qZu8B$HW 6\\\\TE5tj]kZ<7y7mK.pC>DD',:o4<R?xa67*'it(xE41SIR>\\\"xx_N5[\\\"UD!4T#bg<CX8~:Ooh%,0e#E:S]'1C v\\\\585\\\"n#<i9o`}WL)p;KzDE-87c.}WNr)yZsGt_+mZCUY:-$AEzGm!L3E3DaON*R<xUweL^j x-vmiLRrsVk2}3WWTnrbOPYi|UZc2;8\\\\vdoc3tucHWp&\",\"id\":-4267712221317241432,\"email\":null,\"username\":\"^0kaf1=o\\\\{>9Vc!<UhHWcIG4n^\\\"xS.S_F*h%Mardw5W$d7dC@Yqk4zU:#O`Cs/ ABOQ(|4d.43!r[u =(8R8^x#'us \\\".sMx/&\\\">oV%\",\"olweaagcccdcwwvh\":-1016.7,\"skeziwp\":[]}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.email.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesEmailType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "Gm]]U!9DwE'd-sHH?X0hBX/{fx+ECJZkJ.\"H}dya-(HDTop';<Z4iZNS4zhHMMVE1Xp%5UnjiSmM*u3@T:C@/J[&5}M)pjU|/'~7mqT#eY4_HyPbBp;[ZLNP!lSsS3%8Lq7O#i+y\\:alc i2`tO'mR@G!IWa5>z9}I*e])()S_ShmqNcF>DI*Ec2!%s`\\Vi';Rq7dpHK~n8#pt4f6dWms#c#V=k[F!tTA$<V`P&+z@z ;Z59].-b//~bmBtL,8HL")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"3+#A/#M/tSWo_OJc^;l~7xUI]FSnv}&\\\"C5%=|]fqfPa,ZE[nCmwY{Mx,&{c/u;4_5o$!gv~J'I1k&bqFP\\\"cM3?=1.uJ]td3~k(D[x7YC+#Z3\",\"lastName\":\"kWe4xHQ;^}NHhHC&H&5Fq[5G>%f;#8Ew]L5i8pWw>xwhTQP2c=znw\\\"iy*'Q7Kyl*/v08zxOIBEn<s+d(k3_=;&sK9N-`m\\\\AtQE%2$WNP65!i&d$EkwtezYoqS4e&g7'tQM~Y/K[4@usu*!nW8avYgdLVTc%HFC\\\"94s\\\"=cF:uu1$w_/0Bg\\\"1=_L]odzeeRU3{I{@Q)P.wd>$)eX6X')b\\\"/0BpMl=D+$5NIMN\",\"password\":\"/HINq0dzC'/ \\\\yN*<F?/TdURa9FJnTJ{Q:oA5oBV;1)t>qJxA\\\"G:a{g:?{=?B%`}t+1I@le?IxER@q;HTQLW1'*cC]h5q30tSY:Pr4{R;+)L (aqHL >9(}oV&Yj>J4/dRL^0:#\",\"phone\":\"1bs^<BO?fB5i\\\"eUZ-~V*)bC6/Fq|qdGJVeh9$YB_lU~a#O=K<[vr(r4?Q*td6n)l#JZVCMG!gV\\\"%vcO'TlR1![%bo7<'nslCK\\\"PA_1{V:F7^5@xqSRJ$x@\",\"id\":-1008265383154824115,\"email\":662.2,\"username\":\"hekT_=SHFdf:jB#G]#^8[NuD_c(+JA8})cM X7ir|!#gHn%82^\\\\;-\\\\rLF9u97 pQ=4\\\"&_GH{;I.XpWQn`2`C'z(8LDq|COB/O*Y_d%N)\\\"azk}~@z`\",\"fmkvbpzgskxrydoq\":{\"ulaabhbovvszx\":501,\"chfjxhapgysztm\":\"Y[bs\",\"wzem\":-49},\"ehouwvzkyn\":{\"tbfrgh\":\"g J2mK}k\"}}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.email.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesPasswordType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "y\\$.uXvr_JO hVadF1q&_V6")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"8{v/zmo>bA%OQ#@5'>C{|4gTImeNg>2l:#Wlvh\\\"6<2|_I6<7L4IK#Erk W!0.%S~k6RRa*H6JP/^uO|}CsmW1Z%Cauc$X/41~8*SQtLpMBG>>sZ+x.b_E$j'\",\"lastName\":\"R2#LJFjCxVvM#co'(:Zq%zj_P3RF`-%)Sms]5N4yTOqr{\\\\nkYcSz\\\";sr~5eR[\\\\\\\\P_<X,|j p~*+k-citn24;\\\"s8FDy*X@{}7gq\\\\I,yj2\\\"#L!/FnYWTPFV$pEcc\\\\woUd|79>:E&sJ[xv-_N<?.Iy4]Z6$~PU6q7<)&NMf?j'p9[<,pJy.kq'mdqwd=Nbr'4i<M[+VDjxAN2Rn!f:e7\\\"05@,zq+D*P5\",\"password\":null,\"phone\":\"zE7tAG(: \",\"id\":-2935409283684973831,\"email\":\"?/PX;{*/CZC_C#}\\\"pS?g*7l9;hs=tLpz>5V\\\\-S!+3BV5zCIL@{[>}8m2=~y@3#omfxoe;{$AFPBr|a<EV[p{A*a\\\\++q>.e/LkkkyKOXv1,Metv'0s82p*[J[Ig(i//PI5*N\\\\I\\\\cD}.gY9Xx,laKtV\\\"Ol5Q9$*=g8c1NW>JexI{8gqNfO>/}[PgzU\\\\wR6]|g6I*<GHUTOnV=YD*FD;Hc5?~d8\\\\NC\",\"username\":\"&>$hWWPzEr{dwTQGl[ed,{;t +'%\\\"Co;9nPL ;\",\"kjwnwm\":-20.7,\"pnptsxrd\":\"_Y!\"}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.password.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesPasswordType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "2dLvJ4>.|AE40!xN9 ^mGt%c$,'?@.r[TT8)HQ")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\";m)}`~}Lr,(4~k*3_;v5AT,S\",\"lastName\":\"v:DN\\\\K?hDWA%/Y#j9bnf2zmlhu~~]`wOvQ?xVs#LRl=(\\\\\\\\R5[;\\\"aqqo3KxqujxXR06U&)Y YL4gUo@Z0_;N9M*AC37ft>j$k+s^L*UJ)DY$,;^M:XNvKRGO>7ugG+TTWU\\\\Bb{YW}gH.VCFuOKVos@8@ yurr@Xln \\\"WVD;<\",\"password\":{},\"phone\":\"_tn(@vTM,>s[Z,DK\\\"r_jaB!@n^p<fy/Agj5*@3\\\\=Y~C4X,v3,,btge<L,uJXW Vl0V6wTILjsU`=oyR$B87{>eE)MP=Wq&k.r!veOX$>]D7&w[D^gG/I~rcQ' Reh-Et HdelLZo/]1JBo-+X[p:?Af)f8Z:(/1d?CX30}gd\\\"*bV'FB9R 5~)vX~*2BJ/X+/yye%v2T%A7XS<3^H3shSaO3:;#Jd,TOQ[iE;pY.]& D,)i~QZCL(\",\"id\":-3194793026787431628,\"email\":\";/@:Q*FLuJ3Qc= bI\\\\c<L6n{m@>Dror$O$cQ)w?D^iO:e?&2l\\\"Pfg\\\\Rb%&NiSsu1L%($ou3tvs9TZOv^$}D},,u$~~}m\\\"DoyHx\\\"RWq2S4nV%3[nvtRP-B}fdL(2;`q0n{Q+DXM&H__Mi[po4+xm=qQf!tOb>a%aD.Kj>9j~-{ERlY6;wIjQ,;e8{</~ABc=G%#~Bru#]rt.M}JT?&CNI_e-&ftt=1(UZRrOF[\\\"8yv^=0\\\\?\",\"username\":\"ZvSI?2D/23pn`pM}77[sC)TC\\\"$e2y>iI^2]B@.eb4%9 06I&TA1 Yvb5.m1hEhb)2}qd!xQi~j8Ao/\\\",w+0g'L R1VrYtqryp!kDa%hYcC`'!9bf,4-\\\\#C8g'%ef0'>2@+HwQ)yEe$JA!KE,))OpwdizpxCKT}?mdT:GimcM+LaQ|Z ,a%Q=5!\",\"kplogoqg\":\"uHF7-!%\",\"nqythlokhyngj\":[],\"bhxialwiw\":-567}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.password.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesPhoneType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "6fI]m(2G:i'cIAd.#TC$e)8ysa{OmA@$-Q/")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"ci?l[w8X)j408lvCsC]p8gzOpFbcak]Tp?t,Yv0qGoUzV'jawH[aRf&*5h^{QozdQazO>0#^u5&F>6/4DjZ+t9kN43,1Z!1|\\\\#i//b_|3(QBTd?#zySzJRlE7(m{Oc]+Faf;\\\\&~n(\\\\8i#bqKKj%aBocxG!4HCH((j,Iix]6w.R~)Qt4n=\",\"lastName\":\"xR}A\",\"password\":\"{:\\\"YY^<\\\\<Y?\\\\w5/?Jx y/+ b$:&\\\"U+A\\\\2#%Y^|'\\\"a0Q]#-@TEYQa*zd0xtkU_Q\\\"_br.j4NGLop%hggz\\\\\\\"?48h,=G>~wp'3~y'ihg|-Ho(~iqTX*({ty)(g&@[}#5p6\\\\H<J[&g^i3NkUy}SVt4/,.8B!gH-RaPFvg#a*\\\"4x#)le3.jKTX}|:gQNRtSlyJ\",\"phone\":null,\"id\":-2450341916980142992,\"email\":\"Y[r#/-wT}TNsT%tkQKO|woVMX'R.T&L=$XygG% L6qr1E06YR51u+Mc}?izt&J19)jOf0dw8aE4K5^7HubH,WyB_cT||C,kRE+Ch!UuYK(?^E#|Nm6AX3>N{o:G G7k)ap4<=<bh=\",\"username\":\"KoEKxmoB`hsaP@9oucTVy\\\\dVnAC`hxLwXyg=bCwMh;4!,un7OaU9QpyO1%Zs}Wu(LuS]mUd[3:*0b||+E}Ia\\\"!Lu>*C='Iv%TwLc2i-.+\",\"jujcvpjlsqiidqp\":-688.6,\"fyaynacxdbf\":-72}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.phone.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesPhoneType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "D^-WCEKqYUp@j)/M&7IvG#B0ze#uxip?w9c+Xj#Zz{\"ssH,1~X8X<z{c.UkfD4&}2QS6/S%#ZVM3]]LW]6jks=}JFd>+feh\\;<oA~*F-s#BKn2`e+e`OEJg\\t4KH5V9l{|Z>0BGvh]4\\1'\">U}KaK_b{A<k,;C/2At}\\d*(f>bX\\,___BE`l-o+9n3RYcfH\"~o&Jrkf|y!=)cxPBl~{)F91,jSd#-r]")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"1\",\"lastName\":\"ryc(%ox<1eu.|@m6x0\\\\x1>\\\\Cfj4FB8JrUk(aP&-lSF0!>e ,758ghF_26:6D5-1'[242$=TW~bB2sm<UAMgM:m Y'iFU;&rU\\\\XJiE{:%*utA%%h6LAJjT;GW4'?e3xwXl(f>YmENE#'Kuy5j;n|];t-k, `8\\\\iL+,b*5zEsE.x{bk=6=eW@s8~+>7\\\\azKob~C8#\",\"password\":\">mvuG=?qL/UD_6lH{>`@8Vgu,A `Rsk)z;$M+<(t+m#;OS2FubPX~q/\\\\p-rj6H^GQIQ|5Km,6\\\"$ln@+ylluEQvaL/dF|gS|<_/mArYdtw8B~pnou\\\"kXPV$Qq ]nj`9<kj'!#hthO?Yf|~NC< qfp99m?61=i0fG_Xk_?N ?dh5DD8,&dzb?nG9h}|\",\"phone\":236.5,\"id\":-4443260617983453639,\"email\":\"fA\\\\Ui|9rY4AddZt&<[hrA`$?z}07AqPjD@<B`x\\\"~y;mtmG*yaHZ]kDS66vz3jErwz!dsMY&}o5%5cPB_l*x\\\"Q_lm?{;N0z~vI|.v58}?$3X~{^,\",\"username\":\"=JeNDrS6m%k+\\\\fdx\\\"%C^e#ueS$=a;Qr\\\\{*3TS*o7'AGm#`[Zk&tnFj&ER|j]U#YnpMXUXGH[2co;ohO)Ia`,2mWO&niK30l\\\\1.zEx/z{9+F~4#Y],mMkFzA0eBSPp=(h3`po=U(*Y*2y{7M^:C'-c]zND$@@^z|0dCg#\",\"nhiqimysvkparjq\":333,\"erk\":\"iAqF\"}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.phone.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesUserStatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "jZx^<3dVAQE5a ewP\"h")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\">PY4nr\\\\DGA,Kqy)A9kt<\\\\?G3kBs%ei3_=m.+B1LDussg$exIZ)v#3(Mg|3?//JsY :3,X6[nz$Rj[(3OcpdKL(A/tls3Fk!XPH4^B<,3HMV@F~g4y 6e$=q/pD ^&W]/3`v,c&&|LvG/Bxbow\\\"#7}\",\"lastName\":\"jdtf&;/k~j/eaRQs.6zrczv{~y X4 ~9%4.pbjPEjAsnJ\\\"3\\\"u;t:B46:;g1!;2)8$=RE3(OR[}$bq F$&*g^GOE{v(AxAkP+Zt=${{uUGp<W\",\"password\":\"P^vKwyeW[\\\\ 3glzW/mQ|8G{w'mL\\\\n3Q\\\\M6?5S~&w!}&y ==PaI<n6Jv1<q(d_>,PjpiA_o2u8S-;G&Vw<9ASx0YYb:iCo/MY/Nx^H*K]l u_8XZc*ibNH9UO=Vdt\\\\V6IR)W%CA?jaT74qM-y'>mLQ!;B4#%TAjLvai!>w*l*Z1.#^cl,cQ>:)W,Y\\\"?.xP')\\\\{5o/=%{)nV'6=6}^X;]DB0/[P[\\\"2,~A`H#IN{3j<R$W\",\"userStatus\":null,\"phone\":\"-|hL*k#l7do@*CpH,$ g7?cP=rwB'C8]2$~o4}$t?@oS:jZ{b7'Z<#IVuco,SL2e,P1Av$gX\\\\XJacxlb{{yI)L(~@l.,=tZ. (d.6_^?mB='H?.KBYOugk#nEGkFsXyLsk{7bwU\\\\BPbzr\\\\m,Sfg>eiC.G,tca):u\\\"8=(6~i1@1uniB)1\\\"oq|.z,j_W2c2!(eN#V9fnNjtmINxymiuY#hw]yDXHB|!\",\"id\":-600177351561824827,\"email\":\"c\\\\)O%7RQ9*F`vcM4v|6Fy@BWy%]k;5S9gH'cJ=*|w4H,V3`'>Sq2OOC.,FKh#}7,eD|2bl\\\"hr5c4S]Ggpl_t|#hf!cU.o~b<Wgn;W7t}'s EPIo@&`:Gn9RgA9s)I [k)I^utymfC:MfSqq;: hTwM/wE# ha\\\\@[C:#;-Q-*36H\\\\+}nT#:MStj2q1>>!NswET2K8F\\\\Quk='9(_Vb4/Ne|l6C.7{.zjxNv! -,o\",\"username\":\"WNY~Zdf;Id[mh,cbm@X0=ZjD{1QzH\\\"!mb86u!1@^idKNK-eQ-k*Zlw) C<l8'xrl`CWq*T?\\\"*BVG^;I&pY$+ Ytz}H|GOYeX\\\\F'jk%#fl;w\",\"obepi\":[\"XXz9E8)\",\"]YV\"]}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.userStatus.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesUserStatusType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "0!a)dsS/Um_TMY+^J`OHSaRV,Dz^GdN%=jt6HL(o&xu`!sq!BY~=)pv{\">A6q}{|G %eMWT$hzLGZD/7\\/4.[j$VzI@)Q(FI2.GOBI@`Fn*$100BLO\"Ygt.p3kP~G[-Y{;O*s'$")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"UE.V&QP#Y_ZoLzEF){jS~Ybs%+0!vv,Gbr~*-B)&CZ|?tc:ab2c\\\"{0?.vrBmFM7EMe34S*` E_$HXDxH+h/oR\",\"lastName\":\"!\\\"e%hf_-0-_IOy]%H7YSeTZp7tbs^U!D/?/jL!-49nl;_L21RS[U1M4*uN*X=x0$/e(iTE`-Y!@Ju\\\\]hcdtd4:|C-i$V#?yy^Dp4M^!]VC. JS|%p}tq|$|#R^-P\",\"password\":\"uZFFhR1Q7`AK<%(H'Q%GE$V]P*oQS7`cSb9)VKsz{>>#qI:.;D3\\\"u):ODRXm<p)SJ-o_qibQfOkG.s^TeZ=p\",\"userStatus\":\"8v[\",\"phone\":\"|`\",\"id\":-500294795893724013,\"email\":\"xD3VZ0VX93Y)r>{Tvh75(5`KZ=b9)EKTUQ^]Zuq`npWnxy&p(i~a\\\\c]O;_ w_~~0y4_0KTe*2_PzD(7ceBu:!#.O'LN{V{[LU0(D-P4+l;.4NX.-*?F9>F+wAX+R%a_ Y\\\\E@(TX14o@[;,6zmnSN02wCd2f|4#@17gp^tcRUu226&SaO\",\"username\":\"3^E=W`9,oA44Dg0U8Un{)'!j\\\"@lomieByyryPBc23e`_P#,l<eNY%#Q}{|$|K{6ePwLtlu-T|4Na0ldA7Y:/4@[%{cEsJD@K~63%~&qU(@+wR{t7-t\\\\ght[[KSYy^1G:|jjb1fn)-sK52u>+[V;_t>(PuI'Cd$/@z.USW\",\"rvjpeqsztxe\":[\"/_+-y\",\"8Me|*\",\"!i4&v\"],\"xkzyvwhfcbpeujrw\":\"i7\",\"orfhhkoouehxhceb\":{\"jg\":[]}}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.userStatus.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    private static Matcher<Integer> isSuccess() {
        return allOf( greaterThanOrEqualTo(200), lessThan(300));
    }

    private static Matcher<Integer> isBadRequest() {
        return allOf( greaterThanOrEqualTo(400), lessThan(500));
    }

    private static String forTestServer( String defaultUri) {
        String testServer = tcasesApiServer();
        return
            defaultUri == null || !testServer.isEmpty()
            ? testServer
            : defaultUri;
    }

    private static String tcasesApiServer() {
        String uri = System.getProperty( "tcasesApiServer");
        return uri == null? "" : uri.trim();
    }

    private static Map<String,String> responseHeaders( Response response) {
        return
            response.getHeaders().asList().stream()
            .collect( toMap( Header::getName, Header::getValue));
    }
}
