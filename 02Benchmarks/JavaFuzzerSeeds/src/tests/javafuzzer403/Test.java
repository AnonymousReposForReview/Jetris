package tests.javafuzzer403;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:17:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-81L;
    public float fFld=86.350F;
    public static int iFld=-48814;
    public short sFld=7631;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -1.7529);
        FuzzerUtils.init(Test.iArrFld, -12276);
        FuzzerUtils.init(Test.iArrFld1, -8);
    }

    public static long sMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i5) {

        short s1=30974;
        int i7=22287, i8=63158, i9=51039, i10=156;

        Test.instanceCount -= i5;
        i5 = s1;
        for (int i6 : Test.iArrFld) {
            i5 += i5;
            Test.instanceCount += -4152205161579387871L;
            i5 = (int)-5L;
            Test.iArrFld[(159 >>> 1) % N] -= i6;
            for (i7 = 1; i7 < 4; ++i7) {
                Test.instanceCount += i5;
                for (i9 = i7; 2 > i9; i9++) {
                    i8 += -159;
                    Test.instanceCount >>= i9;
                    Test.instanceCount += (1 + (i9 * i9));
                    Test.iArrFld[i9 - 1] = i8;
                    i8 *= (int)Test.instanceCount;
                }
            }
        }
        long meth_res = i5 + s1 + i7 + i8 + i9 + i10;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth() {

        short s=29063;
        int i11=-228, i12=56118, i13=235, i14=0, i15=-6, i16=36509;
        float f=0.24F;
        byte by=117;

        s += (short)(-fMeth(Test.iFld));
        Test.iFld = -67;
        for (i11 = 5; 309 > i11; ++i11) {
            for (i13 = 1; i13 < 5; i13++) {
                Test.iFld = i14;
                for (i15 = 1; i15 < 2; i15++) {
                    Test.instanceCount = i16;
                    f += (i15 * i15);
                    Test.dArrFld[i11] = 52139;
                    i16 -= i12;
                    by += (byte)(i15 * i15);
                    i16 -= Test.iFld;
                    Test.iFld = -24154;
                    Test.iFld >>= i11;
                    Test.iArrFld[i11] -= i11;
                }
            }
        }
        long meth_res = s + i11 + i12 + i13 + i14 + i15 + i16 + Float.floatToIntBits(f) + by;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public short sMeth(long l, int i4) {

        int i17=23244, i18=125, i19=56378, i20=27734, i21=0, i22=2, i23=7, i24=3, iArr[][]=new int[N][N];
        short s2=12083;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -41010);
        FuzzerUtils.init(lArr, 12L);

        i4 <<= (int)(iArr[(i4 >>> 1) % N][(i4 >>> 1) % N] - ((i4++) - lMeth()));
        l = l;
        for (i17 = 15; i17 < 261; i17 += 2) {
            for (i19 = 1; i19 < 13; i19++) {
                fFld += i18;
            }
            for (i21 = 1; i21 < 13; i21 += 3) {
                fFld += s2;
                for (i23 = 1; i23 < 4; ++i23) {
                    Test.instanceCount >>>= i23;
                    if (i20 != 0) {
                    }
                    if (b) {
                        l -= l;
                    }
                    fFld += (-38809 + (i23 * i23));
                    i24 += (i23 - i4);
                    lArr[i21] = -61478;
                }
            }
        }
        long meth_res = l + i4 + i17 + i18 + i19 + i20 + i21 + i22 + s2 + i23 + i24 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=1207, i1=-2614, i2=100, i3=168, i25=-73, i26=116;
        byte by1=-91;
        double d=121.44260;
        boolean b1=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-27182);

        for (i = 9; i < 216; ++i) {
            for (i2 = 2; i2 < 121; i2++) {
                switch ((((Integer.reverseBytes(i2) >>> 1) % 6) * 5) + 116) {
                case 124:
                    fFld += (float)Test.dArrFld[i2 + 1];
                case 125:
                    i3 = sMeth(Test.instanceCount, 10);
                    break;
                case 120:
                    if (false) continue;
                case 140:
                    Test.iFld += (int)Test.instanceCount;
                    i3 *= (int)Test.instanceCount;
                    break;
                case 126:
                    Test.instanceCount -= Test.iFld;
                    Test.iArrFld[i2 + 1] -= (int)Test.instanceCount;
                    break;
                case 138:
                    Test.iArrFld[i2 - 1] >>= i1;
                    break;
                }
                i1 += (i2 * by1);
                i1 *= (int)Test.instanceCount;
                d += Test.instanceCount;
                Test.iFld = -44044;
                switch (((i2 % 1) * 5) + 101) {
                case 102:
                    if (b1) break;
                    i1 += -1;
                    i3 >>= i3;
                    i1 += sFld;
                    break;
                default:
                    i3 = (int)d;
                    Test.iFld |= i;
                    for (i25 = 1; i25 < 2; i25++) {
                        Test.iFld += (i25 ^ Test.iFld);
                        Test.instanceCount = Test.instanceCount;
                        sArr[i25 - 1] += (short)11L;
                        try {
                            i26 = (i2 / i2);
                            Test.iArrFld[i2] = (i26 / Test.iArrFld[i25 + 1]);
                            i1 = (-33535 / i);
                        } catch (ArithmeticException a_e) {}
                        i1 = (int)fFld;
                        i26 >>>= Test.iFld;
                        Test.iArrFld1[i25 + 1] -= (int)Test.instanceCount;
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  lMeth ->  lMeth sMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
