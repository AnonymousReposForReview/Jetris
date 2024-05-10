package tests.javafuzzer1747;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:59:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1L;
    public double dFld=-50.65206;
    public static long lFld=2973067619529698442L;
    public float fFld=0.583F;
    public static volatile short sFld=30847;
    public byte byFld=77;
    public static int iFld=-14;
    public volatile int iFld1=-56223;
    public static double dArrFld[]=new double[N];
    public static byte byArrFld[]=new byte[N];
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 2.99688);
        FuzzerUtils.init(Test.byArrFld, (byte)103);
        FuzzerUtils.init(Test.lArrFld, 18319L);
    }

    public static long byMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i9, int i10, long l) {

        double d=-2.6764;
        short s=-7928;
        int i11=-58634, i12=-52036, i14=59307, i15=152, i16=21751, iArr1[]=new int[N];
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(iArr1, -3);
        FuzzerUtils.init(fArr, 0.591F);

        d -= s;
        Test.instanceCount = Test.instanceCount;
        for (i11 = 11; 246 > i11; i11++) {
            fArr[i11][i11] = s;
            iArr1[i11 + 1] = (int)Test.lFld;
            Test.instanceCount = i10;
            i10 -= (int)-4805394613868193669L;
            for (i14 = 1; i14 < 7; i14 += 2) {
                Test.dArrFld = Test.dArrFld;
                iArr1[i11] = (int)Test.lFld;
                iArr1 = iArr1;
                d += Test.instanceCount;
            }
            i16 = 1;
            while (++i16 < 7) {
                fArr[i16 + 1][i16 + 1] += i14;
                Test.lFld += i9;
            }
        }
        long meth_res = i9 + i10 + l + Double.doubleToLongBits(d) + s + i11 + i12 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i7, int i8) {

        float f2=88.251F, f3=117.331F;
        int i17=148, i18=4, i19=-2, i21=38470, iArr[]=new int[N];
        long l1=4237500247L;
        boolean b=true;
        double d1=-2.31268;
        byte by=-20;

        FuzzerUtils.init(iArr, -9333);

        iArr[(i7 >>> 1) % N] -= iMeth1(-11, i8, Test.lFld);
        Test.byArrFld[(i8 >>> 1) % N] = (byte)f2;
        if (b) {
            for (i17 = 1; i17 < 160; i17++) {
                i19 = 1;
                while (++i19 < 10) {
                    int i20=2829;
                    i8 -= i20;
                    iArr[i17 + 1] *= i20;
                    iArr[i17] *= (int)Test.lFld;
                    i21 -= (int)Test.lFld;
                    Test.instanceCount *= l1;
                    i7 += i19;
                    b = false;
                    d1 = i18;
                }
                f2 = (float)d1;
                by -= (byte)f3;
            }
        } else if (b) {
            i18 = i8;
        } else if (true) {
            i8 = i7;
        }
        long meth_res = i7 + i8 + Float.floatToIntBits(f2) + i17 + i18 + i19 + i21 + l1 + (b ? 1 : 0) +
            Double.doubleToLongBits(d1) + by + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public byte byMeth(float f, int i1, int i2) {

        int i3=-46347, i4=-226, i5=36328, i6=0, iArr2[][]=new int[N][N];
        float f1=-2.169F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr2, -42283);
        FuzzerUtils.init(lArr, -5105184676485842224L);

        i3 = 1;
        do {
            Test.instanceCount += i3;
            for (i4 = 1; 5 > i4; i4 += 2) {
                i5 = -64;
                for (f1 = 1; f1 < 3; f1 += 2) {
                    Test.instanceCount += (long)f1;
                    i5 *= (((i5 * i1) * (-(i5 * i1))) * (-(i3 - i1)));
                    dFld *= (i2--);
                    i5 += (int)(f1 * f1);
                    i6 = ((iMeth(i1, -2) >> i1) / (i4 | 1));
                }
                i6 += (i4 * i4);
                try {
                    i6 = (iArr2[i4 - 1][i4] / i3);
                    i1 = (iArr2[i4 + 1][i3] % i6);
                    i5 = (i1 / -157);
                } catch (ArithmeticException a_e) {}
                lArr[i3 - 1] -= i4;
            }
            Test.lFld >>= Test.lFld;
            i1 += (int)Test.lFld;
        } while (++i3 < 371);
        long meth_res = Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + i5 + Float.floatToIntBits(f1) + i6 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-4, i22=6, i23=33773, i24=14, i25=9, i26=240, i27=-236, i28=-11, i29=61669, i30=44894, i31=-48, i32=221,
            i33=-8, i34=1, i35=-242, i36=138, i37=-3;
        boolean b1=true, bArr[][]=new boolean[N][N];
        long l2=33L;

        FuzzerUtils.init(bArr, false);

        i = (byMeth(fFld, i, i) * i);
        Test.instanceCount -= i;
        for (i22 = 12; i22 < 246; ++i22) {
            for (i24 = 3; i24 < 107; ++i24) {
                Test.instanceCount = i25;
                i += i24;
            }
            Test.instanceCount = (long)1.308F;
            for (i26 = 2; i26 < 107; i26++) {
                for (i28 = i22; i28 < 2; ++i28) {
                    Test.lArrFld[i28 + 1] = i22;
                }
            }
            for (i30 = 6; i30 < 107; ++i30) {
                Test.lArrFld[i30 - 1] = Test.sFld;
                i29 *= -12412;
                i29 += (int)Test.instanceCount;
            }
            for (i32 = i22; i32 < 107; i32++) {
                int i38=-12;
                if (b1) {
                    byFld += (byte)(i32 + fFld);
                    for (i34 = i22; i34 < 1; ++i34) {
                        Test.dArrFld = Test.dArrFld;
                    }
                    i -= (int)11L;
                } else if (b1) {
                    if (b1) continue;
                    Test.instanceCount += i;
                    byFld -= (byte)-80L;
                    Test.dArrFld[i22 + 1] = i23;
                } else {
                    switch (i22 + 124) {
                    case 124:
                        for (i36 = i22; i36 < 1; i36++) {
                            fFld *= byFld;
                            dFld = i33;
                            fFld = Test.lFld;
                            Test.lFld += Test.iFld;
                        }
                    case 125:
                        fFld += (-10 + (i32 * i32));
                        break;
                    case 126:
                    case 127:
                        fFld -= 213;
                        break;
                    case 128:
                        if (b1) break;
                        break;
                    case 129:
                        i35 = i29;
                        break;
                    case 130:
                        i37 += (((i32 * i29) + Test.sFld) - i36);
                        break;
                    case 131:
                        i25 = 2;
                    case 132:
                        b1 = b1;
                        break;
                    case 133:
                        Test.sFld |= (short)Test.lFld;
                        break;
                    case 134:
                        byFld -= (byte)-113.75770;
                    case 135:
                        bArr[i22] = FuzzerUtils.boolean1array(N, (boolean)true);
                        break;
                    case 136:
                        iArrFld[i32 - 1] += (int)fFld;
                        break;
                    case 137:
                        Test.lFld = byFld;
                        break;
                    case 138:
                        fFld -= i24;
                        break;
                    case 139:
                        fFld -= -11;
                        break;
                    case 140:
                        Test.byArrFld[i32 + 1] = (byte)-29641;
                        break;
                    case 141:
                        dFld /= (i24 | 1);
                        break;
                    case 142:
                        try {
                            Test.iFld = (Test.iFld % i31);
                            i27 = (-40124 / i27);
                            i31 = (i35 / -218);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 143:
                        i29 = i23;
                        break;
                    case 144:
                        i29 >>= i27;
                    case 145:
                        byFld = (byte)dFld;
                        break;
                    case 146:
                    case 147:
                        iArrFld[i32 - 1] = i36;
                        break;
                    case 148:
                        l2 = Test.lFld;
                    case 149:
                        if (b1) break;
                        break;
                    case 150:
                        try {
                            i35 = (i22 % 20);
                            i25 = (iArrFld[i22] % i36);
                            iArrFld[i32 - 1] = (i29 / 20405);
                        } catch (ArithmeticException a_e) {}
                    case 151:
                        i33 += (int)(41586L + (i32 * i32));
                        break;
                    case 152:
                        i23 = i37;
                        break;
                    case 153:
                        iArrFld[i32] = iFld1;
                    case 154:
                        i23 = i35;
                        break;
                    case 155:
                        i33 >>= i34;
                        break;
                    case 156:
                        i23 += i32;
                        break;
                    case 157:
                        i23 += i32;
                        break;
                    case 158:
                        i37 >>>= -30204;
                        break;
                    case 159:
                        iArrFld[i32 - 1] >>= i23;
                    case 160:
                        i37 = i27;
                        break;
                    case 161:
                        Test.instanceCount = byFld;
                        break;
                    case 162:
                        i -= i22;
                        break;
                    case 163:
                        iFld1 <<= i23;
                        break;
                    case 164:
                        i31 += (((i32 * i24) + i34) - i33);
                        break;
                    case 165:
                        i23 += -14;
                        break;
                    case 166:
                        i31 = (int)1.968F;
                        break;
                    case 167:
                        iFld1 <<= (int)Test.lFld;
                        break;
                    case 168:
                        dFld += -5776609498987572785L;
                    case 169:
                        Test.iFld = 0;
                        break;
                    case 170:
                        i33 *= (int)dFld;
                        break;
                    case 171:
                        fFld += (i32 + l2);
                        break;
                    case 172:
                        iArrFld = iArrFld;
                        break;
                    case 173:
                        iArrFld[i32] = i37;
                        break;
                    case 174:
                        i27 = i28;
                    case 175:
                    case 176:
                        i37 += 26119;
                        break;
                    case 177:
                        fArrFld[i32] = Test.iFld;
                        break;
                    case 178:
                        i27 >>= 73;
                        break;
                    case 179:
                        iArrFld[i32] <<= (int)Test.lFld;
                        break;
                    case 180:
                        iArrFld[i32 + 1] = i32;
                        break;
                    case 181:
                        i25 = byFld;
                        break;
                    case 182:
                        fFld = i26;
                    case 183:
                        Test.instanceCount = i26;
                        break;
                    case 184:
                        i27 -= i25;
                        break;
                    case 185:
                        Test.byArrFld[i32] = (byte)i36;
                        break;
                    case 186:
                        iArrFld[i32] = byFld;
                        break;
                    case 187:
                        Test.sFld <<= (short)Test.lFld;
                        break;
                    case 188:
                        Test.iFld %= (int)(byFld | 1);
                        break;
                    case 189:
                        iArrFld[i22 + 1] *= (int)fFld;
                        break;
                    case 190:
                        fFld = i38;
                        break;
                    case 191:
                        i38 += (int)Test.instanceCount;
                        break;
                    case 192:
                        Test.lArrFld[i32] -= i24;
                        break;
                    case 193:
                        if (b1) break;
                        break;
                    }
                }
            }
        }



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  iMeth ->  iMeth byMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
