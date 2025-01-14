package tests.javafuzzer1496;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:27:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4122279892348600226L;
    public static boolean bFld=true;
    public static float fFld=-1.906F;
    public byte byArrFld[]=new byte[N];
    public static long lArrFld[][]=new long[N][N];
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -37877L);
        FuzzerUtils.init(Test.iArrFld, 65198);
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.fArrFld, -60.710F);
    }

    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, float f) {

        int i8=12, i9=55959, i10=-12, i11=-6383, iArr[]=new int[N];
        long l1=33L;
        double d1=106.128716;
        boolean b=true;

        FuzzerUtils.init(iArr, -87);

        i7 = i7;
        i8 = 1;
        while ((i8 += 3) < 277) {
            i9 = 1;
            do {
                i7 = i8;
                i7 ^= i9;
                switch (((i8 >>> 1) % 6) + 28) {
                case 28:
                    i7 = i9;
                    i7 = (int)Test.instanceCount;
                    Test.iArrFld[i8 - 1] /= -51208;
                    break;
                case 29:
                    for (l1 = i9; 1 > l1; ++l1) {
                        Test.iArrFld[(int)(l1 + 1)] = i9;
                        d1 *= f;
                        Test.iArrFld = iArr;
                        b = b;
                    }
                    i11 += i7;
                    break;
                case 30:
                case 31:
                    iArr[i9 + 1] += i11;
                    break;
                case 32:
                    i10 += i9;
                case 33:
                default:
                    Test.instanceCount = i10;
                }
            } while (++i9 < 17);
        }
        vMeth1_check_sum += i7 + Float.floatToIntBits(f) + i8 + i9 + l1 + i10 + Double.doubleToLongBits(d1) + (b ? 1 :
            0) + i11 + FuzzerUtils.checkSum(iArr);
    }

    public static byte byMeth(long l) {

        int i5=-7, i6=-18131, i12=30102, i13=-1, i14=-53549, i15=1879, i16=-145, i17=251;
        float f1=7.923F;
        short s=20962;
        byte by1=-5;

        for (i5 = 4; 355 > i5; i5++) {
            vMeth1(i5, f1);
            i6 = (int)2.176F;
            i6 += i5;
            if (Test.bFld) break;
        }
        for (i12 = 5; 147 > i12; ++i12) {
            Test.iArrFld[i12] >>>= (int)Test.instanceCount;
            Test.bFld = Test.bFld;
            Test.iArrFld[i12 + 1] -= s;
        }
        i14 = 1;
        do {
            i15 = 1;
            do {
                for (i16 = i14; i16 < 1; ++i16) {
                    Test.iArrFld[i15 - 1] += by1;
                    i13 *= (int)Test.instanceCount;
                    i6 += (int)(-162L + (i16 * i16));
                }
            } while (++i15 < 9);
        } while (++i14 < 177);
        long meth_res = l + i5 + i6 + Float.floatToIntBits(f1) + i12 + i13 + s + i14 + i15 + i16 + i17 + by1;
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth() {

        int i1=-59306, i2=7610, i3=33, i4=6, i18=216, i19=59;
        byte by=0;
        double d=29.57034, dArr[]=new double[N];
        short s1=21031;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, -67.784F);
        FuzzerUtils.init(dArr, 0.119639);

        if (!((i2++) != by)) {
            for (i1 = 307; i1 > 3; i1--) {
                i2 -= (int)((fArr[i1 + 1][i1]++) - i2);
            }
        }
        for (i3 = 8; 236 > i3; ++i3) {
            Test.lArrFld[i3 + 1][i3 + 1] += ((long)(d - byMeth(Test.instanceCount)) >>> i4);
            if (true) {
                i4 = (int)Test.instanceCount;
                i2 = i4;
                for (i18 = 1; 7 > i18; ++i18) {
                    Test.iArrFld[i18] += 11;
                    i19 += i2;
                    Test.fFld = Test.instanceCount;
                    s1 >>= (short)Test.instanceCount;
                }
            }
        }
        dArr[(4 >>> 1) % N] = s1;
        Test.instanceCount *= (long)1.352F;
        vMeth_check_sum += i1 + i2 + by + i3 + i4 + Double.doubleToLongBits(d) + i18 + i19 + s1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=0, i20=-8, i21=13, i23=1, i24=-137, i25=-33786, i26=130, i27=-172, i28=-18547, i29=-234;
        double d2=51.119419;
        short s2=-24788;

        byArrFld[(i >>> 1) % N] = (byte)((-(i << Test.instanceCount)) - Math.min(i << i, i));
        vMeth();
        i20 = 1;
        do {
            i = i;
            i += (int)d2;
            Test.iArrFld[i20 - 1] += i;
        } while (++i20 < 203);
        i = -224;
        i21 = 1;
        do {
            i23 = 1;
            do {
                for (i24 = 1; i24 < 1; i24++) {
                    i = (int)Test.instanceCount;
                    if (Test.bFld) continue;
                    Test.bArrFld[i21 - 1] = true;
                    i = (int)Test.fFld;
                    i25 += i24;
                    i <<= i21;
                }
                Test.instanceCount += i23;
                i25 = 34570;
                switch (((i21 % 8) * 5) + 4) {
                case 7:
                    i25 = i;
                    for (i26 = 1; i26 < 1; i26++) {
                        i25 = i21;
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)-5);
                        Test.lArrFld[i23 - 1] = Test.lArrFld[i23 + 1];
                        i27 >>= (int)Test.instanceCount;
                        if (false) break;
                        i27 -= (int)Test.instanceCount;
                    }
                    for (i28 = i23; i28 < 1; ++i28) {
                        Test.iArrFld[i21 + 1] |= 43672;
                        Test.iArrFld[i28 + 1] |= (int)7405290636673680889L;
                    }
                    break;
                case 27:
                    Test.iArrFld[i21 - 1] += (int)Test.instanceCount;
                    break;
                case 32:
                    i = 2;
                    break;
                case 36:
                    Test.instanceCount = i21;
                    break;
                case 16:
                    s2 += (short)(i23 | Test.instanceCount);
                case 44:
                    Test.fArrFld[i23 - 1] = 62.548F;
                    break;
                case 43:
                    Test.iArrFld[i21 - 1] &= i21;
                    break;
                case 30:
                    Test.fFld += (((i23 * i26) + Test.instanceCount) - Test.fFld);
                    break;
                }
            } while (++i23 < 103);
        } while (++i21 < 243);


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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 byMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
