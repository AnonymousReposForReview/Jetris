package tests.javafuzzer248;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:54:52 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=121L;
    public static volatile byte byFld=-21;
    public boolean bFld=false;
    public static int iFld=-104;
    public static double dFld=2.43067;
    public byte byFld1=-124;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -4);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, int i4) {

        double d=-1.38054, d1=77.30941;
        int i5=-54197, i6=8, i7=115, iArr[][]=new int[N][N];
        boolean b=false;
        long l1=213L;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, 3129);
        FuzzerUtils.init(byArr, (byte)15);

        d = 237;
        do {
            i5 = 1;
            while (++i5 < 7) {
                Test.instanceCount += i4;
                i3 = i5;
                if (b) continue;
                d1 += l1;
            }
            for (i6 = 7; i6 > 1; i6--) {
                i4 += i6;
                iArr[(int)(d)][(i5 >>> 1) % N] *= (int)d;
                i4 = i4;
                if (b) break;
                i4 += Test.byFld;
                i4 += (i6 * i6);
                i7 *= i4;
            }
            byArr[(int)(d - 1)] = (byte)i6;
        } while (--d > 0);
        vMeth1_check_sum += i3 + i4 + Double.doubleToLongBits(d) + i5 + (b ? 1 : 0) + Double.doubleToLongBits(d1) + l1
            + i6 + i7 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
    }

    public void vMeth() {

        int i8=-8, i9=16, i10=-3, i11=3, i12=-1655, i13=-20294, i14=-3;
        float f1=0.71F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 7L);

        vMeth1(i8, i8);
        i9 = 1;
        do {
            for (i10 = i9; 5 > i10; ++i10) {
                bFld = bFld;
                i12 = 1;
                do {
                    Test.instanceCount = 8546L;
                    Test.iFld = (int)f1;
                    i8 += (-66 + (i12 * i12));
                    Test.instanceCount += i12;
                } while (++i12 < 1);
                Test.instanceCount += (((i10 * Test.instanceCount) + Test.instanceCount) - Test.iFld);
                for (i13 = 1; i13 < 1; i13++) {
                    lArr[i10] *= (long)1.511F;
                    bFld = bFld;
                    Test.dFld = i12;
                    i8 += (1 + (i13 * i13));
                }
            }
        } while (++i9 < 312);
        vMeth_check_sum += i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) + i13 + i14 +
            FuzzerUtils.checkSum(lArr);
    }

    public int iMeth(float f, int i2, long l) {

        int i15=-83, i16=232, i17=17168, i18=-4, i19=43682;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -435692809518815895L);

        vMeth();
        i15 = 1;
        while (++i15 < 133) {
            for (i16 = i15; i16 < 12; ++i16) {
                Test.byFld |= (byte)i17;
                Test.iArrFld[i15 - 1] >>= -117;
                for (i18 = 1; i18 < 1; ++i18) {
                    Test.iFld &= (int)-38220L;
                    Test.instanceCount = i15;
                    try {
                        Test.iArrFld[i15] = (Test.iFld % -57451);
                        i19 = (Test.iFld % Test.iArrFld[i18 - 1]);
                        Test.iArrFld[i16] = (i19 / 334188816);
                    } catch (ArithmeticException a_e) {}
                    lArr1 = FuzzerUtils.long1array(N, (long)3735085772L);
                    i2 = 8;
                    Test.iFld += (i18 * i18);
                }
                lArr1[i16] = i16;
                Test.instanceCount *= Test.byFld;
                Test.iFld += (i16 * i16);
            }
        }
        long meth_res = Float.floatToIntBits(f) + i2 + l + i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-252, i1=-172, i20=-12, i21=-103, i22=1, i23=-42692, i24=-105, i25=24731, i26=-36276, iArr1[][]=new
            int[N][N];
        byte by=-47, by1=-100;
        float f2=-97.564F, fArr[]=new float[N];
        short s=-3111;
        long l2=8L, lArr2[]=new long[N];

        FuzzerUtils.init(fArr, 2.533F);
        FuzzerUtils.init(iArr1, -58);
        FuzzerUtils.init(lArr2, 64556L);

        for (i = 7; 311 > i; i += 3) {
            i1 = (((by++) + (--i1)) - iMeth(f2, 3, Test.instanceCount));
            Test.iFld -= i1;
            i20 = 1;
            do {
                fArr[i20] = Test.iFld;
            } while (++i20 < 248);
            if (bFld) break;
            i21 = 248;
            do {
                f2 -= f2;
                Test.iFld += i1;
                switch ((i * 5) + 41) {
                case 56:
                    i22 = 1;
                    do {
                        switch (((i20 >>> 1) % 2) + 80) {
                        case 80:
                            iArr1[i22][i21] += i22;
                            s = (short)i1;
                            Test.dFld = f2;
                            break;
                        case 81:
                            Test.iArrFld[i21 - 1] = i;
                        default:
                            fArr[i22] -= i23;
                            i23 ^= i20;
                        }
                        Test.instanceCount += i23;
                        f2 += i22;
                        Test.iFld += (i22 | Test.instanceCount);
                    } while (++i22 < 1);
                    break;
                case 175:
                    switch ((i % 2) + 120) {
                    case 120:
                        Test.instanceCount = i20;
                    case 121:
                        Test.instanceCount = i22;
                        break;
                    default:
                        Test.instanceCount = Test.instanceCount;
                        i1 >>= i1;
                        for (i24 = i; i24 < 1; ++i24) {
                            Test.instanceCount += -239;
                            f2 -= Test.instanceCount;
                            i1 = (int)Test.instanceCount;
                        }
                    }
                    break;
                case 123:
                    lArr2[i - 1] = -48105L;
                case 303:
                    Test.instanceCount -= (long)31.234F;
                    break;
                case 300:
                    i23 += i;
                    break;
                case 240:
                    l2 += i24;
                case 327:
                    i1 += (((i21 * Test.instanceCount) + i20) - i20);
                case 335:
                    Test.iFld += i1;
                    break;
                case 307:
                    iArr1[i + 1][i21 + 1] = i20;
                    break;
                case 297:
                    bFld = bFld;
                case 91:
                    i25 *= i25;
                    break;
                case 222:
                    Test.iFld >>>= (int)Test.instanceCount;
                    break;
                case 238:
                    i1 = i20;
                    break;
                case 199:
                    i25 += (86 + (i21 * i21));
                    break;
                case 255:
                case 389:
                    f2 += -3918440899L;
                    break;
                case 292:
                    i1 += Test.iFld;
                    break;
                case 374:
                    Test.iFld += i21;
                case 163:
                    byFld1 += (byte)(i21 + i20);
                    break;
                case 99:
                    Test.iFld += (int)Test.dFld;
                    break;
                case 134:
                    i1 += (((i21 * f2) + f2) - i20);
                case 89:
                    f2 *= i;
                    break;
                case 351:
                    f2 = i24;
                    break;
                case 45:
                    i23 >>>= i21;
                    break;
                case 107:
                    Test.iFld *= i23;
                    break;
                case 232:
                    iArr1[i21 - 1][i] += i20;
                    break;
                case 102:
                case 87:
                    s += (short)i21;
                case 200:
                    i1 += (i21 - Test.iFld);
                    break;
                case 231:
                    s *= (short)i;
                    break;
                case 81:
                    l2 += i24;
                    break;
                case 317:
                    i1 -= 4;
                    break;
                case 343:
                    Test.instanceCount += i21;
                case 358:
                    i1 -= i23;
                    break;
                case 153:
                case 149:
                    i1 = i25;
                case 279:
                    i26 += (i21 - Test.iFld);
                    break;
                case 218:
                    l2 += i;
                    break;
                case 145:
                case 168:
                    i25 *= 111;
                    break;
                case 229:
                    i26 |= i;
                    break;
                case 223:
                    f2 += i21;
                case 68:
                    bFld = bFld;
                case 214:
                    i26 += (i21 - Test.iFld);
                    break;
                case 293:
                    Test.iArrFld[i21] *= i22;
                case 289:
                    Test.instanceCount += i25;
                    break;
                case 387:
                    i25 <<= -44405;
                    break;
                case 158:
                    i26 -= (int)-46.492F;
                    break;
                case 144:
                    Test.iFld += i21;
                    break;
                case 90:
                    Test.instanceCount = (long)f2;
                case 139:
                    Test.iFld = i22;
                    break;
                case 365:
                    Test.instanceCount += (-104 + (i21 * i21));
                    break;
                case 209:
                    Test.instanceCount += Test.iFld;
                    break;
                case 194:
                    iArr1[i][i21 - 1] = i;
                    break;
                case 58:
                    i25 = i25;
                    break;
                case 98:
                    l2 <<= i1;
                    break;
                case 305:
                    i26 += (6 + (i21 * i21));
                    break;
                case 117:
                    by1 += (byte)s;
                    break;
                case 67:
                    i23 = i24;
                    break;
                case 69:
                    i25 += (i21 + i21);
                case 380:
                    i1 = i23;
                case 355:
                    i1 ^= -55;
                case 299:
                    Test.instanceCount += Test.instanceCount;
                    break;
                case 230:
                    Test.iArrFld[i - 1] = (int)Test.dFld;
                    break;
                case 143:
                    bFld = bFld;
                    break;
                case 135:
                    l2 += 1;
                    break;
                case 318:
                    fArr[i + 1] *= by1;
                case 71:
                case 73:
                    Test.iFld -= Test.iFld;
                    break;
                case 245:
                    f2 = f2;
                    break;
                default:
                    i23 = i26;
                }
            } while (--i21 > 0);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
