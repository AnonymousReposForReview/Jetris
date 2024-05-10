package tests.javafuzzer2555;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:28:47 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2767684246L;
    public static int iFld=-2;
    public static float fFld=14.781F;
    public static double dFld=49.24849;
    public short sFld=19470;
    public boolean bFld=true;

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i8=-14233, i9=-58330;
        boolean b=false;
        float f=-1.958F;

        Test.iFld -= Test.iFld;
        for (i8 = 11; i8 < 189; ++i8) {
            if (b) continue;
            Test.iFld <<= Test.iFld;
            if (b) break;
        }
        b = b;
        Test.iFld *= (int)f;
        i9 = (int)Test.instanceCount;
        Test.instanceCount *= Test.iFld;
        vMeth1_check_sum += i8 + i9 + (b ? 1 : 0) + Float.floatToIntBits(f);
    }

    public static void vMeth(int i6, int i7) {

        int i10=134, i11=120, i12=-84, i13=-232, i14=5, i15=23737, iArr2[]=new int[N];
        short s=30514;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.699F);
        FuzzerUtils.init(iArr2, -24501);

        vMeth1();
        for (i10 = 14; i10 < 303; ++i10) {
            Test.instanceCount = 104;
            for (i12 = 6; i12 > 1; --i12) {
                for (i14 = i10; i14 < 2; i14++) {
                    i6 += (int)Test.instanceCount;
                    i6 >>>= s;
                    switch ((i12 % 8) + 38) {
                    case 38:
                    case 39:
                        Test.fFld = Test.instanceCount;
                        Test.fFld -= Test.instanceCount;
                        i15 &= (int)Test.instanceCount;
                        Test.instanceCount += (((i14 * Test.fFld) + i14) - i13);
                        break;
                    case 40:
                        i6 = i11;
                        break;
                    case 41:
                        Test.dFld = i7;
                        i15 ^= i14;
                        break;
                    case 42:
                        fArr[i12 + 1] += 9.763F;
                    case 43:
                        Test.dFld -= i7;
                    case 44:
                        iArr2[i10 + 1] ^= 211;
                        break;
                    case 45:
                        i13 = (int)Test.instanceCount;
                        break;
                    default:
                        Test.instanceCount |= s;
                    }
                }
            }
        }
        vMeth_check_sum += i6 + i7 + i10 + i11 + i12 + i13 + i14 + i15 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
    }

    public static boolean bMeth(long l) {

        int i16=7, i17=-43, i18=-57896, i19=-14, iArr1[]=new int[N];
        boolean b1=true;
        short s1=13161;
        float fArr1[][]=new float[N][N], fArr2[][]=new float[N][N];

        FuzzerUtils.init(iArr1, 25454);
        FuzzerUtils.init(fArr1, 2.998F);
        FuzzerUtils.init(fArr2, 1.264F);

        Test.iFld <<= iArr1[(Test.iFld >>> 1) % N];
        vMeth(Test.iFld, Test.iFld);
        Test.iFld ^= 185;
        Test.instanceCount = Test.instanceCount;
        for (i16 = 5; i16 < 166; ++i16) {
            for (i18 = 1; i18 < 10; ++i18) {
                i19 -= (int)Test.fFld;
                fArr1 = fArr2;
                i19 += (i18 + Test.fFld);
                i17 += (i18 * i19);
                switch (((i16 % 10) * 5) + 73) {
                case 79:
                    Test.iFld ^= 12;
                    break;
                case 93:
                    if (b1) break;
                    l -= i18;
                    break;
                case 102:
                    s1 += (short)(i18 | (long)Test.fFld);
                    break;
                case 106:
                    i17 %= (int)(Test.iFld | 1);
                    break;
                case 109:
                    Test.instanceCount += i18;
                    break;
                case 110:
                    Test.iFld *= -229;
                    break;
                case 74:
                    Test.dFld -= i19;
                    break;
                case 108:
                    i19 = i19;
                    break;
                case 81:
                    Test.fFld = Test.iFld;
                    break;
                case 113:
                    l *= i18;
                    break;
                default:
                    Test.fFld = i19;
                }
            }
        }
        long meth_res = l + i16 + i17 + i18 + i19 + (b1 ? 1 : 0) + s1 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=54415, i1=-215, i2=-6, i3=22, i4=13, i5=-216, i20=23622, i21=-3, i22=5, i23=11, iArr[]=new int[N];
        long l1=216L, lArr[]=new long[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, -5);
        FuzzerUtils.init(lArr, 11L);
        FuzzerUtils.init(bArr, false);

        for (i = 268; i > 4; i -= 2) {
            i1 = iArr[i];
            i1 += (i + i);
            for (i2 = i; i2 < 190; i2++) {
                lArr[i + 1] >>= (++i1);
                i1 = (int)Test.instanceCount;
                for (i4 = 1; i4 < 1; i4++) {
                    boolean b2=false;
                    if (bMeth(Test.instanceCount) ^ b2) break;
                    if (b2) {
                        lArr[i - 1] += i1;
                    } else {
                        i3 = (int)Test.instanceCount;
                        bArr[(i5 >>> 1) % N] = b2;
                    }
                    Test.instanceCount = i3;
                    if (b2) continue;
                }
                iArr[i2] >>= i4;
            }
            for (i20 = 190; i20 > 4; i20 -= 2) {
                i3 >>>= -59;
                try {
                    i5 = (i5 / -787751938);
                    iArr[i] = (Test.iFld % Test.iFld);
                    i5 = (Test.iFld % i21);
                } catch (ArithmeticException a_e) {}
                sFld >>= (short)i5;
                i1 = i;
                Test.iFld -= (int)34088L;
                i1 = (int)l1;
            }
            if (bFld) {
                i5 = i3;
                for (i22 = 4; 190 > i22; ++i22) {
                    switch ((i22 % 2) + 82) {
                    case 82:
                    case 83:
                        lArr[i22 - 1] += i21;
                        break;
                    }
                    Test.iFld = 80;
                    i23 += (i22 ^ Test.iFld);
                    iArr[i] += -10;
                }
            } else if (false) {
                iArr[i - 1] *= (int)43426L;
            } else if (false) {
                Test.instanceCount = (long)Test.fFld;
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
