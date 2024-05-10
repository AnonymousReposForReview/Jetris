package tests.javafuzzer2964;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 23:57:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3478104067L;
    public static float fFld=-38.590F;
    public static byte byFld=23;
    public static volatile boolean bFld=false;
    public static double dArrFld[]=new double[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.80503);
        FuzzerUtils.init(Test.lArrFld, -3599333567729166341L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l1, int i5) {

        short s=30806;
        double d1=-109.79324;
        int i6=12, i7=221, i8=29188, i9=7772, i10=0, i11=214, iArr[]=new int[N];
        float f=-121.918F;
        boolean b=false;

        FuzzerUtils.init(iArr, -102);

        i5 = s;
        i5 *= -102;
        iArr[(i5 >>> 1) % N] += (int)-4464589217322953424L;
        d1 *= i5;
        for (i6 = 5; 253 > i6; i6++) {
            f = 7;
            while (--f > 0) {
                for (i8 = i6; i8 < 1; i8++) {
                    i5 &= i7;
                    if (b) break;
                }
                i7 ^= i9;
                Test.instanceCount += (long)f;
            }
            for (i10 = i6; i10 < 7; ++i10) {
                i7 += (int)f;
                i11 -= i6;
                i9 += (((i10 * i8) + f) - s);
            }
        }
        long meth_res = l1 + i5 + s + Double.doubleToLongBits(d1) + i6 + i7 + Float.floatToIntBits(f) + i8 + i9 + (b ?
            1 : 0) + i10 + i11 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i2, int i3, int i4) {

        double d2=-109.38568;
        int i12=-200, i13=114, i14=-154, i15=-252, i16=11, iArr1[]=new int[N];
        short s1=-24239, sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -2);
        FuzzerUtils.init(sArr, (short)23765);
        FuzzerUtils.init(lArr, 246L);

        Test.instanceCount = lMeth(Test.instanceCount, i2);
        for (d2 = 259; d2 > 16; d2 -= 3) {
            iArr1[(int)(d2)] = i2;
            i3 += (int)((long)d2 | (long)Test.fFld);
        }
        try {
            switch (((i4 >>> 1) % 9) + 1) {
            case 1:
                s1 *= (short)i2;
                Test.fFld = i2;
                break;
            case 2:
                Test.instanceCount *= -45106;
                i12 += Test.byFld;
                for (i13 = 2; i13 < (224 + 400); ++i13) {
                    for (i15 = 4; (1 - 400) < i15; i15 -= 3) {
                        Test.fFld += ((long)i15 | (long)i13);
                        iArr1[i15 + 1] = (int)Test.instanceCount;
                        sArr[i13] = (short)i12;
                    }
                }
                break;
            case 3:
                iArr1[(-191 >>> 1) % N] <<= 5;
            case 4:
                Test.fFld *= i12;
                break;
            case 5:
                iArr1[(i4 >>> 1) % N] *= i4;
                break;
            case 6:
                Test.byFld *= (byte)Test.instanceCount;
                break;
            case 7:
                Test.bFld = Test.bFld;
                break;
            case 8:
                i4 >>= i4;
                break;
            case 9:
                lArr[(i13 >>> 1) % N] *= i4;
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            Test.byFld -= (byte)Test.instanceCount;
        }
        vMeth1_check_sum += i2 + i3 + i4 + Double.doubleToLongBits(d2) + i12 + s1 + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(int i1, double d, long l) {

        int i17=-173, i18=46606, i19=45107, i20=113, i21=-174, i22=-121;
        short s2=-25779;
        long lArr1[][]=new long[N][N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr1, -14L);
        FuzzerUtils.init(fArr, 1.105F);

        vMeth1(i1, i1, i1);
        Test.fFld -= 1;
        for (i17 = 20; i17 < 367; ++i17) {
            l += (long)Test.fFld;
        }
        i1 = s2;
        for (i19 = 3; i19 < 207; i19++) {
            switch ((i19 % 9) + 4) {
            case 4:
                Test.fFld += i19;
            case 5:
                i18 = i17;
                l -= i1;
            case 6:
                i18 = i19;
                lArr1[i19 - 1][i19 + 1] >>= l;
                for (i21 = 1; 8 > i21; ++i21) {
                    i18 = i22;
                    l = i20;
                }
            case 7:
                fArr[i19 - 1] -= i21;
                break;
            case 8:
                Test.instanceCount = i22;
            case 9:
                Test.fFld = (float)d;
            case 10:
                i1 *= i18;
                break;
            case 11:
                Test.instanceCount += (((i19 * i22) + i17) - l);
                break;
            case 12:
                d -= i19;
            }
        }
        vMeth_check_sum += i1 + Double.doubleToLongBits(d) + l + i17 + i18 + s2 + i19 + i20 + i21 + i22 +
            FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=40599, i23=-136, i24=59321, i25=66, i26=44152, i27=7, i28=14309, i29=8, i30=-84, i31=-1, i32=57936,
            iArr2[][]=new int[N][N];
        double d3=0.116250;
        short s3=22111;
        long l2=-322954180L;

        FuzzerUtils.init(iArr2, 63);

        switch (((((i + i) >>> 1) % 8) * 5) + 40) {
        case 51:
            vMeth(i, d3, Test.instanceCount);
            break;
        case 52:
            for (i23 = 5; i23 < 149; i23++) {
                Test.instanceCount = 55811;
                i = i;
                Test.instanceCount = i;
                if (Test.bFld) {
                    i24 += (i23 * i23);
                    i24 += i;
                    for (i25 = 8; 174 > i25; i25 += 2) {
                        for (i27 = 1; i27 < 3; ++i27) {
                            i26 -= Test.byFld;
                            i = i28;
                        }
                        i26 += i25;
                        Test.instanceCount >>>= s3;
                        Test.instanceCount += i25;
                        for (i29 = 1; i29 < 3; i29++) {
                            i = (int)Test.instanceCount;
                            i &= (int)Test.instanceCount;
                        }
                        Test.dArrFld[i23] += Test.instanceCount;
                        iArr2[i25 + 1][i25 - 1] = -6;
                        for (i31 = 1; i31 < 3; i31++) {
                            iArr2[i31 + 1][i23 - 1] >>= -20092;
                            Test.instanceCount = -14150L;
                            switch (((i25 % 1) * 5) + 60) {
                            case 64:
                                l2 >>= i;
                                if (Test.bFld) continue;
                                break;
                            }
                            if (Test.bFld) break;
                            i26 *= (int)l2;
                            Test.instanceCount = i28;
                        }
                    }
                } else if (false) {
                    i26 >>>= i;
                } else {
                    if (Test.bFld) continue;
                }
            }
            break;
        case 67:
            l2 = i29;
        case 70:
            Test.instanceCount = Test.byFld;
            break;
        case 73:
            i24 &= -173;
        case 78:
            i30 *= (int)d3;
        case 42:
            Test.byFld <<= (byte)i26;
            break;
        case 80:
            i30 >>= i25;
            break;
        default:
            i32 = i32;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}